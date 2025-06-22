# 📦 Reto 1 S4: Simulación asincrónica en una app de movilidad

### 🎯 Objetivo general de la sesión
⚒️ Comprender las diferencias entre concurrencia y asincronía en Java, aprender a utilizar CompletableFuture para la ejecución de tareas asincrónicas, y aplicar estas técnicas en casos prácticos como operaciones I/O o simulación de servicios externos.

### 🎯 Objetivo del reto
⚒️ Aplicar CompletableFuture para simular procesos asincrónicos en una app de movilidad (tipo Uber o DiDi), realizando tareas en paralelo como calcular la ruta y estimar la tarifa, y enviando una notificación al usuario una vez finalizadas.

## 💻 ¿Qué se implementó?
Se utilizó `CompletableFuture` para simular un flujo asincrónico de viaje:
- Se desarrollaron métodos asincrónicos `calcularRuta()` y `estimarTarifa()` con latencias simuladas.
- Se combinaron los resultados con `thenCombine` para mostrar ruta y tarifa final.
- Se agregó manejo de errores con `exceptionally` para simular fallas en los servicios.
- Se mostró un mensaje final con la información completa del viaje.


