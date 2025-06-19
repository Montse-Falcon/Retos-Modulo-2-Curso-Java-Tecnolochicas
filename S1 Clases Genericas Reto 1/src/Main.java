import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear listas de órdenes
        List<OrdenMasa> ordenesMasa = new ArrayList<>();
        ordenesMasa.add(new OrdenMasa("A123", 500));
        ordenesMasa.add(new OrdenMasa("A124", 750));

        List<OrdenPersonalizada> ordenesPersonalizadas = new ArrayList<>();
        ordenesPersonalizadas.add(new OrdenPersonalizada("P456", 100, "ClienteX"));
        ordenesPersonalizadas.add(new OrdenPersonalizada("P789", 150, "ClienteY"));

        List<OrdenPrototipo> ordenesPrototipo = new ArrayList<>();
        ordenesPrototipo.add(new OrdenPrototipo("T789", 10, "Diseño"));
        ordenesPrototipo.add(new OrdenPrototipo("T790", 5, "Pruebas"));

        // Mostrar órdenes
        GestorOrdenes.mostrarOrdenes(ordenesMasa);
        GestorOrdenes.mostrarOrdenes(ordenesPersonalizadas);
        GestorOrdenes.mostrarOrdenes(ordenesPrototipo);

        // Procesar personalizadas
        GestorOrdenes.procesarPersonalizadas(new ArrayList<>(ordenesPersonalizadas), 200);

        // Desafío adicional: contar
        System.out.println("📊 Resumen total de órdenes:");
        System.out.println("🔧 Producción en masa: " + ordenesMasa.size());
        System.out.println("🛠️ Personalizadas: " + ordenesPersonalizadas.size());
        System.out.println("🧪 Prototipos: " + ordenesPrototipo.size());
    }
}
