public class PagoConTransferencia implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("🏦 Procesando pago con transferencia bancaria por $" + monto);
    }
}
