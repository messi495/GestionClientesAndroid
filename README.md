## Gestión de Clientes – Android (Kotlin + SQLite)
# Descripción del proyecto

Aplicación Android desarrollada en Kotlin que permite gestionar una base de datos local de clientes utilizando SQLite.
La app permite añadir, buscar, listar y eliminar clientes mediante una interfaz sencilla basada en Material Design.

# Objetivo de la actividad

El objetivo principal de esta práctica es integrar conocimientos esenciales del desarrollo Android:

-Creación de interfaces con XML.

Uso de actividades y navegación entre pantallas.

-Implementación de un CRUD con SQLite y SQLiteOpenHelper.

-Representación de datos con RecyclerView y un Adapter personalizado.

-Validación de datos de entrada.

-Aplicación de principios de diseño limpio en Android.

Tecnologías utilizadas

-Kotlin

-Android Studio

-SQLite

-RecyclerView

-Material Design Components

# Funcionalidades implementadas

-Añadir clientes con validación de nombre, correo y teléfono.

-Listado completo mediante RecyclerView.

-Búsqueda de clientes por nombre en tiempo real.

-Eliminación individual de clientes.

-Interfaz limpia y ordenada.

# Estructura del proyecto
app/
 ├── java/com.example.segundaactividadprimertrimestre/
 │     ├── MainActivity.kt
 │     ├── AddClienteActivity.kt
 │     ├── Cliente.kt
 │     ├── ClienteAdapter.kt
 │     └── ClienteDBHelper.kt
 └── res/
       ├── layout/activity_main.xml
       ├── layout/activity_add_cliente.xml
       ├── layout/item_cliente.xml
       ├── values/colors.xml
       └── values/strings.xml

# Experiencia al realizar la actividad

Esta actividad ha sido una introducción completa al flujo de trabajo real de una aplicación Android.
Conectar las pantallas con la base de datos, hacer que el RecyclerView funcionase correctamente, aplicar validaciones y probar la app en ejecución ha permitido entender mejor cómo se estructuran y se comportan las aplicaciones Kotlin en Android.

Los errores iniciales, las referencias incorrectas y las pruebas constantes fueron parte natural del proceso, pero al final la aplicación quedó funcional y bien estructurada, lo cual demuestra el aprendizaje adquirido.

# Instrucciones para ejecutarlo

Clonar el repositorio.

Abrir el proyecto en Android Studio.

Sincronizar Gradle cuando lo pida.

Ejecutar la aplicación en un emulador o dispositivo físico.
