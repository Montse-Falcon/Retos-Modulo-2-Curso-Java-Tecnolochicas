# 🏗️ Reto 1 S3: Confirmación segura de pedidos en una pizzería

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de la programación funcional en Java, identificar las ventajas del uso de funciones puras, Optional, Stream API y composición funcional para escribir código más conciso, expresivo y menos propenso a errores.

### 🎯 Objetivo del reto
⚒️ Aplicar Optional y Stream API para filtrar y transformar una lista de pedidos de una pizzería, asegurando el manejo seguro de datos incompletos (como números telefónicos) y generando mensajes personalizados para confirmar los envíos.

## 💻 ¿Qué se implementó?
Se aplicó `Optional` y `Stream API` para el manejo seguro de información:
- Se creó la clase `Pedido` con atributos cliente, tipoEntrega y teléfono.
- Se usó `Optional<String>` para manejar teléfonos potencialmente nulos.
- Se filtraron pedidos para entrega a domicilio y se generaron mensajes personalizados de confirmación.
- Se imprimieron solo los mensajes con números válidos, evitando `NullPointerException`.
