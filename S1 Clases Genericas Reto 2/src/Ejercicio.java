public class Ejercicio extends MaterialCurso {
    private boolean revisado;

    public Ejercicio(String titulo, String autor) {
        super(titulo, autor);
        this.revisado = false;
    }

    public void marcarComoRevisado() {
        revisado = true;
        System.out.println("✅ Ejercicio '" + titulo + "' marcado como revisado.");
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("📝 Ejercicio - Título: " + titulo + " - Autor: " + autor + " - Revisado: " + revisado);
    }
}
