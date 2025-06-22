# 📁 Reto 1 S8: Refactorizar un procesador de pagos aplicando SOLID

### 🎯 Objetivo general de la sesión
⚒️ Adoptar **buenas prácticas de diseño en Java**, reforzar conceptos de **pruebas unitarias, depuración** y conocer las **herramientas esenciales** para mantener proyectos limpios y colaborativos (control de versiones, documentación, logs).

### 🎯 Objetivo del reto
⚒️ **Identificar malas prácticas** en un procesador de pagos y **refactorizarlo aplicando principios SOLID (especialmente SRP, OCP y DIP)**, mejorando la mantenibilidad y extensibilidad del código.

## 💻 ¿Qué se implementó?
Se refactorizó una clase mal diseñada aplicando principios SOLID:
- Se implementó una interfaz `MetodoPago` como abstracción general.
- Se crearon clases concretas: `PagoTarjeta`, `PagoPaypal`, `PagoCripto`, y `PagoTransferencia`.
- Se diseñó `PaymentProcessor` para depender de `MetodoPago` y no de clases específicas.
- Se probó el procesamiento en la clase `Main` con varios tipos de pago.
- Se imprimió el resultado por consola, por ejemplo:
`💳 Procesando pago con tarjeta por $1,500.00.`

