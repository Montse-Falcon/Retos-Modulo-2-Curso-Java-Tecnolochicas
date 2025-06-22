# 📦 Reto 2 S4: Gestión asincrónica de vuelos en un aeropuerto

### 🎯 Objetivo general de la sesión
⚒️ Comprender las diferencias entre concurrencia y asincronía en Java, aprender a utilizar CompletableFuture para la ejecución de tareas asincrónicas, y aplicar estas técnicas en casos prácticos como operaciones I/O o simulación de servicios externos.

### 🎯 Objetivo del reto
⚒️ Simular un flujo asincrónico y no bloqueante para la gestión de aterrizajes en un aeropuerto internacional, integrando varias consultas en paralelo con CompletableFuture, combinando sus resultados y manejando errores potenciales.

## 💻 ¿Qué se implementó?
Se construyó un flujo de verificación de aterrizajes usando `CompletableFuture`:
- Se implementaron cuatro métodos asincrónicos: `verificarPista()`, `verificarClima()`, `verificarTraficoAereo()`, y `verificarPersonalTierra()`.
- Cada método simula una verificación crítica con latencia y posibles fallas.
- Se usó `CompletableFuture.allOf()` para evaluar todas las condiciones.
- Se imprimió un mensaje de autorización o denegación del aterrizaje, con manejo de errores y resultados aleatorios.
