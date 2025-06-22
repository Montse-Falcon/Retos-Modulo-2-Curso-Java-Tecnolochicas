public class Main {
    public static void main(String[] args) {
        ProcesadorDePagos procesador = new ProcesadorDePagos();

        procesador.ejecutarPago(new PagoConTarjeta(), 1500.00);
        procesador.ejecutarPago(new PagoConPaypal(), 8500.00);
        procesador.ejecutarPago(new PagoConCripto(), 10557.00);
        procesador.ejecutarPago(new PagoConTransferencia(), 150897.27);
    }
}
