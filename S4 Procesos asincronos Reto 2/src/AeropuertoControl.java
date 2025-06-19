import java.util.concurrent.*;
import java.util.*;

public class AeropuertoControl {

    private static final Random random = new Random();

    // Simula validaciones asincrónicas con latencia aleatoria y resultado booleano
    public CompletableFuture<Boolean> verificarPista() {
        return CompletableFuture.supplyAsync(() -> {
            simularEspera("🛬 Verificando pista...");
            return true; // Puedes cambiar a false para simular condición no óptima
        });
    }

    public CompletableFuture<Boolean> verificarClima() {
        return CompletableFuture.supplyAsync(() -> {
            simularEspera("🌦️ Verificando condiciones meteorológicas...");
            return true;
        });
    }

    public CompletableFuture<Boolean> verificarTraficoAereo() {
        return CompletableFuture.supplyAsync(() -> {
            simularEspera("✈️ Verificando tráfico aéreo...");
            return true;
        });
    }

    public CompletableFuture<Boolean> verificarPersonalTierra() {
        return CompletableFuture.supplyAsync(() -> {
            simularEspera("👷 Verificando personal de tierra...");
            return true;
        });
    }

    private void simularEspera(String mensaje) {
        System.out.println(mensaje);
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(2) + 2); // 2-3 segundos
        } catch (InterruptedException e) {
            throw new RuntimeException("Fallo en simulación: " + mensaje);
        }
    }

    public void autorizarAterrizaje() {
        CompletableFuture<Boolean> pista = verificarPista();
        CompletableFuture<Boolean> clima = verificarClima();
        CompletableFuture<Boolean> trafico = verificarTraficoAereo();
        CompletableFuture<Boolean> personal = verificarPersonalTierra();

        CompletableFuture<Void> todas = CompletableFuture.allOf(pista, clima, trafico, personal);

        todas.thenRun(() -> {
            try {
                // Recolectamos los resultados de cada verificación
                boolean okPista = pista.get();
                boolean okClima = clima.get();
                boolean okTrafico = trafico.get();
                boolean okPersonal = personal.get();

                if (okPista && okClima && okTrafico && okPersonal) {
                    System.out.println("✅ 🛬 Aterrizaje autorizado: todas las condiciones óptimas.");
                } else {
                    System.out.println("🚫 Aterrizaje denegado: condiciones no óptimas.");
                }
            } catch (Exception e) {
                System.out.println("❌ Error al verificar condiciones: " + e.getMessage());
            }
        }).exceptionally(ex -> {
            System.out.println("❌ Error en proceso asincrónico: " + ex.getMessage());
            return null;
        });
    }

    public static void main(String[] args) throws InterruptedException {
        AeropuertoControl control = new AeropuertoControl();
        control.autorizarAterrizaje();

        // Espera para permitir que todas las tareas completen antes de que finalice el programa
        Thread.sleep(5000);
    }
}
