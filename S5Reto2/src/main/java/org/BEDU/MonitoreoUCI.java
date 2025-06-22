package org.BEDU;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.Random;

public class MonitoreoUCI {

    static Random random = new Random();

    static class SignosVitales {
        int pacienteId;
        int frecuenciaCardiaca; // bpm
        int presionSistolica;   // mmHg
        int presionDiastolica;  // mmHg
        int oxigeno;            // SpO2 %

        public SignosVitales(int pacienteId, int fc, int ps, int pd, int oxi) {
            this.pacienteId = pacienteId;
            this.frecuenciaCardiaca = fc;
            this.presionSistolica = ps;
            this.presionDiastolica = pd;
            this.oxigeno = oxi;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Flux<SignosVitales> paciente1 = generarSignos(1);
        Flux<SignosVitales> paciente2 = generarSignos(2);
        Flux<SignosVitales> paciente3 = generarSignos(3);

        Flux<SignosVitales> flujoTotal = Flux.merge(paciente1, paciente2, paciente3)
                .publish()
                .autoConnect();

        flujoTotal
                .filter(sv ->
                        sv.frecuenciaCardiaca < 50 || sv.frecuenciaCardiaca > 120 ||
                                sv.presionSistolica < 90 || sv.presionSistolica > 140 ||
                                sv.presionDiastolica < 60 || sv.presionDiastolica > 90 ||
                                sv.oxigeno < 90
                )
                .delayElements(Duration.ofSeconds(1)) // backpressure para que el sistema no se sature
                .subscribeOn(Schedulers.parallel())
                .subscribe(sv -> {
                    if (sv.frecuenciaCardiaca < 50 || sv.frecuenciaCardiaca > 120)
                        System.out.println("⚠️ Paciente " + sv.pacienteId + " - FC crítica: " + sv.frecuenciaCardiaca + " bpm");
                    if (sv.presionSistolica < 90 || sv.presionSistolica > 140 ||
                            sv.presionDiastolica < 60 || sv.presionDiastolica > 90)
                        System.out.println("⚠️ Paciente " + sv.pacienteId + " - PA crítica: " +
                                sv.presionSistolica + "/" + sv.presionDiastolica + " mmHg");
                    if (sv.oxigeno < 90)
                        System.out.println("⚠️ Paciente " + sv.pacienteId + " - SpO2 baja: " + sv.oxigeno + "%");
                });

        Thread.sleep(20000); // mantiene la simulación por 20 segundos
    }

    static Flux<SignosVitales> generarSignos(int pacienteId) {
        return Flux.interval(Duration.ofMillis(300))
                .map(i -> new SignosVitales(
                        pacienteId,
                        40 + random.nextInt(100),  // FC entre 40-140
                        80 + random.nextInt(80),   // Sistólica entre 80-160
                        50 + random.nextInt(60),   // Diastólica entre 50-110
                        85 + random.nextInt(15)    // SpO2 entre 85-99
                ))
                .subscribeOn(Schedulers.parallel());
    }
}
