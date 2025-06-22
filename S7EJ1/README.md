# 📁 Reto 1 S7: Expandiendo la API REST de empleados en RRHH

### 🎯 Objetivo general de la sesión
⚒️ Introducir los fundamentos de la **arquitectura de microservicios**, comprender su estructura **básica**, las ventajas frente a monolitos, y crear una **API REST simple** usando **Spring Boot**.

### 🎯 Objetivo del reto
⚒️ Extender una **API REST** con **Spring Boot** para incluir nuevas funcionalidades en la **gestión de empleados**, como **buscar empleados por puesto** o **eliminar registros**.
Esto te permitirá practicar la creación de nuevos **endpoints REST** y aplicar buenas prácticas en el diseño de **APIs escalables**.

## 💻 ¿Qué se implementó?
Se amplió una API REST para gestionar empleados en una empresa:
- Se creó un endpoint GET `/api/empleados/puesto/{puesto}` para buscar empleados por puesto.
- Se agregó un endpoint DELETE `/api/empleados/{id}` para eliminar empleados por ID.
- Se implementaron los métodos `buscarPorPuesto()` y `eliminarEmpleado()` en `EmpleadoService`.
- Se ajustó el controlador `EmpleadoController` para manejar nuevas rutas.
- Se probaron los endpoints con Postman simulando búsquedas y eliminaciones.

