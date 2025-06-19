import java.util.List;

public class PlataformaEducativa {

    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {
        System.out.println("📚 Materiales del curso:");
        for (MaterialCurso m : lista) {
            m.mostrarDetalle();
        }
        System.out.println();
    }

    public static void contarDuracionVideos(List<? extends Video> lista) {
        int total = 0;
        for (Video v : lista) {
            total += v.getDuracion();
        }
        System.out.println("⏱️ Duración total de videos: " + total + " minutos\n");
    }

    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {
        for (Object obj : lista) {
            if (obj instanceof Ejercicio) {
                ((Ejercicio) obj).marcarComoRevisado();
            }
        }
        System.out.println();
    }
}
