# 🔀 Reto 2 S2: Acceso controlado a un recurso médico crítico

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de la programación concurrente en Java, conocer los distintos mecanismos para crear y sincronizar hilos, y aplicar buenas prácticas para evitar errores comunes como condiciones de carrera o bloqueos.

### 🎯 Objetivo del reto
⚒️ Comprender los fundamentos de la programación concurrente en Java, conocer los distintos mecanismos para crear y sincronizar hilos, y aplicar buenas prácticas para evitar errores comunes como condiciones de carrera o bloqueos.

## 💻 ¿Qué se implementó?
Se implementó el uso sincronizado de un recurso compartido (ej. sala de cirugía) con ReentrantLock:
- Se definió una clase `RecursoMedico` con método `usar(String profesional)` sincronizado con `lock`.
  - Se simularon accesos concurrentes desde varios hilos, representando profesionales médicos.
  - Se utilizó un `ExecutorService` para ejecutar múltiples tareas simultáneamente.
  - Se imprimió el flujo de entrada y salida para verificar exclusión mutua.

