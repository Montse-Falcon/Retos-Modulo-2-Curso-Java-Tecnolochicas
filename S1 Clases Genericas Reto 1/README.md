# 🏁 Reto 1 S1: Gestión de órdenes de producción en planta

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de las clases y métodos genéricos en Java, incluyendo su sintaxis, beneficios y aplicaciones prácticas en estructuras de datos y métodos reutilizables.

### 🎯 Objetivo del reto
⚒️ Implementar genéricos y wildcards para gestionar diferentes tipos de órdenes de producción en una planta industrial, clasificando entre producción en masa, personalizada y prototipos.
Además, deberás procesar las órdenes utilizando métodos flexibles con restricciones de tipo.

## 💻 ¿Qué se implementó?
Se desarrolló un sistema de gestión de órdenes en una planta industrial usando clases genéricas:

- Se creó una clase abstracta `OrdenProduccion` y subclases:
   - `OrdenMasa` (producción estándar)
   - `OrdenPersonalizada` (incluye cliente)
   - `OrdenPrototipo` (incluye fase de desarrollo)
- Se implementaron métodos genéricos:
  - `mostrarOrdenes(List<? extends OrdenProduccion>)`: despliega información de órdenes.
  - `procesarPersonalizadas(List<? super OrdenPersonalizada>, int)`: agrega costo extra a órdenes personalizadas.
- Se simularon 6 órdenes (2 de cada tipo) en el método `main`, mostrando los resultados por consola.
- Se agregó una función adicional para contar el número total de órdenes por tipo.
