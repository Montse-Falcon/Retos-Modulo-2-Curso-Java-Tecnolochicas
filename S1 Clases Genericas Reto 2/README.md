# 🏁 Reto 2 S1: Gestión de materiales de curso en una plataforma

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de las clases y métodos genéricos en Java, incluyendo su sintaxis, beneficios y aplicaciones prácticas en estructuras de datos y métodos reutilizables.

### 🎯 Objetivo del reto
⚒️ Utilizar genéricos, wildcards ( ` ? `,  `extends `,  `super `) y restricciones de tipo para gestionar diferentes materiales de un curso (videos, artículos, ejercicios) en una plataforma educativa, aplicando filtros y acciones específicas por tipo de material.

## 💻 ¿Qué se implementó?
Se simuló una plataforma educativa para manejar distintos tipos de material didáctico:
- Se definió una clase abstracta `MaterialCurso` y subclases:
  - `Video` (incluye duración)
  - `Articulo` (incluye número de palabras)
  - `Ejercicio` (incluye estado revisado)
- Se aplicaron genéricos para:
  - Mostrar todos los materiales (`mostrarMateriales`)
  - Sumar duración de los videos (`contarDuracionVideos`)
  - Marcar ejercicios como revisados (`marcarEjerciciosRevisados`)
- Se manejaron listas heterogéneas y se usó `Predicate` para filtrar por autor.
- Se imprimieron resultados detallados en consola, incluyendo filtros y actualizaciones.
