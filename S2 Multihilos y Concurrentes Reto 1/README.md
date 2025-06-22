# 🔀 Reto 1 S2: Simulación concurrente de sistemas en una misión

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de la programación concurrente en Java, conocer los distintos mecanismos para crear y sincronizar hilos, y aplicar buenas prácticas para evitar errores comunes como condiciones de carrera o bloqueos.

### 🎯 Objetivo del reto
⚒️ Simular el comportamiento paralelo de varios subsistemas críticos durante una misión espacial utilizando programación concurrente con `Runnable, Callable, ExecutorService y Future`.

## 💻 ¿Qué se implementó?
Se desarrolló una simulación paralela de sistemas espaciales con concurrencia en Java:
- Cada subsistema (`Navegación, Soporte vital, Térmico, Comunicaciones`) fue una clase que implementa `Callable<String>`.
- Se utilizaron `ExecutorService` y `Future` para manejar la ejecución concurrente.
- Se simularon latencias con `Thread.sleep()` y se imprimieron los resultados al finalizar.
- Se aseguró el cierre del servicio con `bshutdown()` para liberar los hilos.
- Definir una clase `Paciente` con atributos:



