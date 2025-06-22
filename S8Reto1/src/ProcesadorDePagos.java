public class ProcesadorDePagos {

    public void ejecutarPago(MetodoPago metodo, double monto) {
        metodo.procesarPago(monto);
    }
}
