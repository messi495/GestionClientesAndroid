Gestión de Clientes – Android (Kotlin + SQLite)
Descripción del proyecto

Esta app es una pequeña aplicación Android desarrollada en Kotlin cuyo objetivo es gestionar una lista de clientes de forma local utilizando una base de datos SQLite.
Permite añadir clientes, visualizarlos en un RecyclerView, buscar por nombre, y borrar registros.
La idea de la actividad es practicar el manejo de actividades, layouts, adapters, navegación, CRUD básico y persistencia con SQLite.

Objetivo de la actividad

El objetivo principal era desarrollar una aplicación funcional que conectara todos los elementos básicos de un proyecto Android real:

Creación de pantallas y diseño de interfaces.

Uso de RecyclerView y ViewHolder.

Creación de base de datos SQLite con un helper propio.

Inserción y lectura de datos mediante consultas.

Flujo completo entre actividades.

Aplicación de validaciones y buenas prácticas.

La actividad busca que te acostumbres a mezclar UI, lógica y persistencia, igual que en un proyecto normal.

Tecnologías utilizadas

Kotlin

Android Studio

RecyclerView

SQLite

Material Design Components

Características principales

Añadir clientes con validación de campos.

Visualización en lista usando RecyclerView.

Actualización automática de la lista.

Búsqueda por coincidencia en tiempo real.

Eliminación de un cliente desde la propia tarjeta.

Interfaz sencilla basada en Material Design.

Estructura del proyecto
/app
 ├── java/com.example.segundaactividadprimertrimestre
 │    ├── MainActivity.kt
 │    ├── AddClienteActivity.kt
 │    ├── Cliente.kt
 │    ├── ClienteAdapter.kt
 │    └── ClienteDBHelper.kt
 └── res
      ├── layout/activity_main.xml
      ├── layout/activity_add_cliente.xml
      ├── layout/item_cliente.xml
      ├── values/colors.xml
      └── values/strings.xml

Mi experiencia realizándolo

La actividad al principio parecía más simple de lo que era. Entre layouts que daban fallo, IDs que no coincidían, errores raros de SQLite y el RecyclerView que nunca funciona a la primera, la sensación era básicamente “ok, esto no sale a la primera ni de broma”.

Pero a medida que iba encajando las piezas —el adapter funcionando, la BD guardando datos, el diseño material quedando más ordenado— empezó a cobrar sentido. Terminas entendiendo cómo trabaja Android de verdad cuando mueves datos entre pantallas y la app deja de romperse.

En resumen: actividad bastante útil, con sus dolores de cabeza típicos de Android, pero que te obliga a unir todo lo que has aprendido y sentir que realmente puedes construir una app desde cero.
