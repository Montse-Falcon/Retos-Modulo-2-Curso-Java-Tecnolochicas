import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class MovilidadApp {

    public CompletableFuture<String> calcularRuta() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("🚦 Calculando ruta...");
                TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(2, 4)); // 2-3 segundos
                return "Centro -> Norte";
            } catch (InterruptedException e) {
                throw new RuntimeException("Error al calcular la ruta");
            }
        });
    }

    public CompletableFuture<Double> estimarTarifa() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("💰 Estimando tarifa...");
                TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(1, 3)); // 1-2 segundos
                return ThreadLocalRandom.current().nextDouble(60.0, 90.0); // tarifa aleatoria
            } catch (InterruptedException e) {
                throw new RuntimeException("Error al estimar tarifa");
            }
        });
    }

    public void procesarSolicitud() {
        calcularRuta().thenCombine(estimarTarifa(), (ruta, tarifa) -> {
                    return String.format("✅ 🚗 Ruta calculada: %s | Tarifa estimada: $%.2f", ruta, tarifa);
                })
                .exceptionally(e -> "❌ Error durante el proceso: " + e.getMessage())
                .thenAccept(System.out::println);
    }

    public static void main(String[] args) throws InterruptedException {
        MovilidadApp app = new MovilidadApp();
        app.procesarSolicitud();

        // 🕒 Espera suficiente para que los procesos asincrónicos terminen
        Thread.sleep(4000);
    }
}
