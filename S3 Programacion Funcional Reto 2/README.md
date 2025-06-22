# 🏗️ Reto 2 S3: Cadena funcional para procesamiento de encuestas

### 🎯 Objetivo general de la sesión
⚒️ Comprender los fundamentos de la programación funcional en Java, identificar las ventajas del uso de funciones puras, Optional, Stream API y composición funcional para escribir código más conciso, expresivo y menos propenso a errores.

### 🎯 Objetivo del reto
⚒️ Aplicar composición funcional en Java utilizando Stream API y flatMap para procesar listas anidadas (encuestas de distintas sucursales de una clínica), filtrar respuestas específicas y transformar los datos en mensajes útiles para el área de calidad.

## 💻 ¿Qué se implementó?
Se modelaron encuestas de sucursales de una clínica y se procesaron con `flatMap`:
- Se crearon las clases `Encuesta` y `Sucursal`, esta última con lista de encuestas.
- Se filtraron encuestas con calificación menor o igual a 3 (clientes insatisfechos).
- Se recuperaron comentarios no nulos usando `Optional<String>`.
- Se generaron mensajes de seguimiento por sucursal con `Stream API` y se imprimieron.
