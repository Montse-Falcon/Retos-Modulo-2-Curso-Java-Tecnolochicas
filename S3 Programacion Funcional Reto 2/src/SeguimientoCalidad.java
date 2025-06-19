import java.util.*;
import java.util.stream.*;

public class SeguimientoCalidad {
    public static void main(String[] args) {
        // 🏥 Sucursales con sus encuestas
        Sucursal centro = new Sucursal("Centro", List.of(
                new Encuesta("Ana", "El tiempo de espera fue largo", 2),
                new Encuesta("Luis", null, 3),
                new Encuesta("Marta", "Excelente atención", 5)
        ));

        Sucursal norte = new Sucursal("Norte", List.of(
                new Encuesta("Pedro", "La atención fue buena, pero la limpieza puede mejorar", 3),
                new Encuesta("Carlos", null, 4)
        ));

        List<Sucursal> sucursales = List.of(centro, norte);

        System.out.println("📋 Seguimiento a comentarios de pacientes insatisfechos:");

        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3)
                                .flatMap(e -> e.getComentario().stream()
                                        .map(c -> "Sucursal " + sucursal.getNombre() +
                                                ": Seguimiento a paciente con comentario: \"" + c + "\""))
                )
                .forEach(System.out::println);
    }
}
