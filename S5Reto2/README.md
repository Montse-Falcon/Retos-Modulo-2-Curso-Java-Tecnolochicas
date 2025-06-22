# 🧬 Reto 2 S5: Monitoreo reactivo de signos vitales en una UCI

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de la programación reactiva en Java, conocer las diferencias con el manejo tradicional de streams, e implementar flujos reactivos utilizando Project Reactor o RxJava, abordando conceptos clave como Mono, Flux y control de backpressure.

### 🎯 Objetivo del reto
⚒️ Simular un sistema reactivo que monitorea signos vitales de pacientes críticos en tiempo real en una Unidad de Cuidados Intensivos (UCI), aplicando backpressure para controlar el flujo de datos y encadenar operaciones reactivas que filtren eventos anómalos.

## 💻 ¿Qué se implementó?
Se desarrolló un sistema de monitoreo médico en tiempo real en una UCI usando programación reactiva con `Flux`. La implementación incluyó:
- Simulación de signos vitales (FC, PA, SpO2) para 3 pacientes, generando datos cada 300 ms.
- Se filtraron eventos críticos según rangos clínicos:
  - FC < 50 o > 120 bpm.
  - PA < 90/60 o > 140/90 mmHg.
  - SpO2 < 90%.
- Se usó `delayElements(Duration.ofSeconds(1))` para aplicar backpressure y desacoplar la velocidad de generación de eventos de su procesamiento.
- Se integraron los flujos de los 3 pacientes con `Flux.merge()` para consolidar eventos en una única secuencia.
- Se priorizaron eventos de frecuencia cardíaca sobre otros al detectar simultaneidad.

El sistema logra alertar solo en condiciones críticas, evitando saturación visual o procesamiento innecesario.
