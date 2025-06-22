# 📁 Reto 2 S8: Refactorizar un procesador de pagos aplicando SOLID

### 🎯 Objetivo general de la sesión
⚒️ Adoptar **buenas prácticas de diseño en Java**, reforzar conceptos de **pruebas unitarias, depuración** y conocer las **herramientas esenciales** para mantener proyectos limpios y colaborativos (control de versiones, documentación, logs).

### 🎯 Objetivo del reto
⚒️ Desarrollar un **microservicio simple de reservas para un restaurante**, integrando **pruebas unitarias con JUnit 5, mocks con Mockito** y **logs con SLF4J** para registrar el comportamiento del sistema.

## 💻 ¿Qué se implementó?
Se construyó un microservicio para gestionar reservas en un restaurante:
- Se creó la interfaz `DisponibilidadService` para simular verificación de disponibilidad.
- Se implementó la clase `ReservaService`:
  - Verifica disponibilidad.
  - Confirma o rechaza reservas.
  - Registra logs con SLF4J.
- Se desarrollaron pruebas unitarias con JUnit 5 y Mockito:
  - Simulación de disponibilidad.
  - Verificación de llamadas al mock.
  - Aserciones para confirmar comportamiento esperado.

