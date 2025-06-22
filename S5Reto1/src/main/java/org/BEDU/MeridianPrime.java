package org.BEDU;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class MeridianPrime {

    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        Flux<String> trafico = Flux.interval(Duration.ofMillis(500))
                .map(i -> random.nextInt(101)) // 0 a 100%
                .filter(nivel -> nivel > 70)
                .map(nivel -> "🚗 Alerta: Congestión del " + nivel + "% en Avenida Solar")
                .onBackpressureBuffer()
                .subscribeOn(Schedulers.parallel());

        Flux<String> contaminacion = Flux.interval(Duration.ofMillis(600))
                .map(i -> random.nextInt(101)) // 0 a 100 ug/m3
                .filter(pm -> pm > 50)
                .map(pm -> "🌫️ Alerta: Contaminación alta (PM2.5: " + pm + " ug/m3)")
                .subscribeOn(Schedulers.parallel());

        Flux<String> accidentes = Flux.interval(Duration.ofMillis(800))
                .map(i -> {
                    String[] prioridades = {"Baja", "Media", "Alta"};
                    return prioridades[random.nextInt(prioridades.length)];
                })
                .filter(p -> p.equals("Alta"))
                .map(p -> "🚑 Emergencia vial: Accidente con prioridad Alta")
                .subscribeOn(Schedulers.parallel());

        Flux<String> trenes = Flux.interval(Duration.ofMillis(700))
                .map(i -> random.nextInt(11)) // 0 a 10 minutos
                .filter(min -> min > 5)
                .map(min -> "🚝 Tren maglev con retraso crítico: " + min + " minutos")
                .onBackpressureBuffer()
                .subscribeOn(Schedulers.parallel());

        Flux<String> semaforos = Flux.interval(Duration.ofMillis(400))
                .scan(new int[]{0}, (estado, i) -> {
                    String[] colores = {"Verde", "Amarillo", "Rojo"};
                    String color = colores[random.nextInt(colores.length)];
                    if (color.equals("Rojo")) estado[0]++;
                    else estado[0] = 0;
                    return estado;
                })
                .filter(estado -> estado[0] >= 3)
                .map(estado -> "🚦 Semáforo en Rojo detectado 3 veces seguidas en cruce Norte")
                .subscribeOn(Schedulers.parallel());

        // ⛓️ Combinamos todos los eventos críticos
        Flux<String> eventosCriticos = Flux.merge(trafico, contaminacion, accidentes, trenes, semaforos)
                .publish()
                .autoConnect();

        // 📤 Suscripción individual
        eventosCriticos.subscribe(System.out::println);

        // 🚨 Alerta global: si ocurren 3 o más eventos en un segundo
        eventosCriticos
                .window(Duration.ofSeconds(1))
                .flatMap(window -> window.collectList())
                .filter(lista -> lista.size() >= 3)
                .map(lista -> {
                    StringBuilder alerta = new StringBuilder("\n🚨 Alerta global: Múltiples eventos críticos detectados:\n");
                    lista.forEach(evento -> alerta.append(" - ").append(evento).append("\n"));
                    return alerta.toString();
                })
                .subscribe(System.out::println);

        // 🕒 Mantener la app viva por un rato
        Thread.sleep(20000);
    }
}
