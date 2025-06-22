# 📂 Reto 1 S6: Registro de productos para inventario

### 🎯 Objetivo general de la sesión
⚒️ Conocer las distintas interfaces que Java proporciona para interactuar con bases de datos, así como los fundamentos del uso de JPA y la creación de entidades para implementar operaciones CRUD.

### 🎯 Objetivo del reto
⚒️ Reforzar la creación de entidades con JPA, usando el mismo proyecto del ejemplo anterior para agregar validaciones y consultas específicas en la clase Producto, simulando un sistema de inventario más realista.

## 💻 ¿Qué se implementó?
Se construyó una entidad `Producto` para simular un sistema de inventario:
- Se definieron los atributos: `id`, `nombre`, `descripcion`, y `precio`.
- Se añadieron validaciones con `@NotBlank` y `@Min(1)`.
- Se creó un repositorio `ProductoRepository` con consultas personalizadas:
  - `findByPrecioGreaterThan()`
  - `findByNombreContainingIgnoreCase()`
  - `findByPrecioBetween()`
  - `findByNombreStartingWithIgnoreCase()`
- Se probaron consultas desde `CommandLineRunner` mostrando productos por criterios de búsqueda.
