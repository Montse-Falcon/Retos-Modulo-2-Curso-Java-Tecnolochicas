public class PagoConPaypal implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("💻 Procesando pago con PayPal por $" + monto);
    }
}
