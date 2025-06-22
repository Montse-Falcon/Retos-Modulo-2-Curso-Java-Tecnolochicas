# 📂 Reto 2 S6:  Productos por marca en una tienda en línea

### 🎯 Objetivo general de la sesión
⚒️ Conocer las distintas interfaces que Java proporciona para interactuar con bases de datos, así como los fundamentos del uso de JPA y la creación de entidades para implementar operaciones CRUD.

### 🎯 Objetivo del reto
⚒️ Reforzar el uso de relaciones en JPA mediante una entidad nueva llamada `Marca`, relacionada con Producto, simulando un modelo básico de una tienda en línea. Se trabajará con relaciones `@ManyToOne`, ideal para representar que varios productos pertenecen a una marca.

## 💻 ¿Qué se implementó?
Se extendió el modelo anterior con una relación entre productos y marcas:
- Se creó la entidad `Marca` con atributos `id` y `nombre`.
- Se estableció la relación `@ManyToOne` desde `Producto` hacia `Marca`.
- Se creó el repositorio `MarcaRepository`.
- Se agregaron marcas y se asociaron productos desde `CommandLineRunner`.
- Se imprimieron productos agrupados por marca usando `System.out.println()`.
