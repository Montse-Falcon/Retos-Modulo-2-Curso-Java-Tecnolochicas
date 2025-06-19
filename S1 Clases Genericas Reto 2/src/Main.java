import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear materiales
        Video v1 = new Video("Java Básico", "ProfeX", 30);
        Video v2 = new Video("POO en Java", "ProfeY", 45);

        Articulo a1 = new Articulo("Genéricos en Java", "AutorA", 1200);
        Articulo a2 = new Articulo("Wildcards explicados", "AutorB", 950);

        Ejercicio e1 = new Ejercicio("Ejercicio 1 - Genéricos", "TutorZ");
        Ejercicio e2 = new Ejercicio("Ejercicio 2 - Herencia", "TutorW");

        // Unificar todos en una sola lista
        List<MaterialCurso> materiales = new ArrayList<>();
        materiales.add(v1);
        materiales.add(v2);
        materiales.add(a1);
        materiales.add(a2);
        materiales.add(e1);
        materiales.add(e2);

        // Crear listas específicas
        List<Video> videos = List.of(v1, v2);
        List<Articulo> articulos = List.of(a1, a2);
        List<MaterialCurso> materialesParaEjercicios = new ArrayList<>(materiales);

        // Mostrar todos los materiales
        PlataformaEducativa.mostrarMateriales(materiales);

        // Contar duración total de los videos
        PlataformaEducativa.contarDuracionVideos(videos);

        // Marcar ejercicios como revisados
        PlataformaEducativa.marcarEjerciciosRevisados(materialesParaEjercicios);

        // Mostrar nuevamente los materiales para verificar cambios
        PlataformaEducativa.mostrarMateriales(materiales);
    }
}
