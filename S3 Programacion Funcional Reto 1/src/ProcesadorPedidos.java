import java.util.*;
import java.util.stream.*;

public class ProcesadorPedidos {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Carlos", "domicilio", "555-1234"),
                new Pedido("Ana", "local", null),
                new Pedido("Luis", "domicilio", null),
                new Pedido("María", "domicilio", "555-5678")
        );

        System.out.println("📞 Confirmaciones enviadas:");

        pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio")) // solo domicilio
                .map(Pedido::getTelefono) // Optional<String>
                .filter(Optional::isPresent) // solo los que tienen teléfono
                .map(Optional::get) // extraer el teléfono
                .map(tel -> "📞 Confirmación enviada al número: " + tel)
                .forEach(System.out::println); // mostrar mensajes
    }
}
