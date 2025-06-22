# 📦 Reto 1 S5: Gestión reactiva de sistemas críticos en Meridian Prime

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de la programación reactiva en Java, conocer las diferencias con el manejo tradicional de streams, e implementar flujos reactivos utilizando Project Reactor o RxJava, abordando conceptos clave como Mono, Flux y control de backpressure.

### 🎯 Objetivo del reto
⚒️ Simular el **flujo reactivo** y no bloqueante para la **gestión en tiempo real de los sistemas críticos** de **Meridian Prime** (una ciudad inteligente inspirada en Horizon Zero Dawn), usando **Project Reactor** y **Flux** para procesar **múltiples flujos concurrentes.**

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación reactiva en Java utilizando Project Reactor para simular la gestión de sistemas críticos de una ciudad inteligente. Se implementó lo siguiente:
- Se crearon cinco flujos independientes con `Flux.interval()` para simular los siguientes sistemas:
  - Sensores de tráfico: porcentaje de congestión.
  - Contaminación del aire: nivel de partículas PM2.5.
  - Accidentes viales: eventos con prioridad (Baja, Media, Alta).
  - Trenes maglev: retrasos en minutos.
  - Semáforos inteligentes: cambios de estado.
- Cada flujo:
  - Genera datos simulados en intervalos definidos (400–800 ms).
  - Filtra eventos críticos (ej. congestión > 70%, contaminación > 50, prioridad Alta).
  - Emite alertas en consola para eventos relevantes.
- Se aplicó `onBackpressureBuffer()` en al menos un flujo para simular control de presión (ej. trenes maglev).
- Se usó `Flux.merge()` para combinar flujos y detectar alertas globales cuando tres o más eventos críticos coinciden en tiempo.
- Este flujo reactivo permite controlar varios sistemas simultáneamente, con capacidad de respuesta fluida y filtrado eficiente de eventos importantes.

