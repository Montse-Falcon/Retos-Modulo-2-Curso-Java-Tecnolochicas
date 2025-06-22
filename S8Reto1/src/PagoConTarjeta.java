public class PagoConTarjeta implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
