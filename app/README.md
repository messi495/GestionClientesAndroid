# CRM de Gestión de Clientes - Android App

## Descripción del Proyecto
Esta aplicación permite registrar, buscar, editar y eliminar clientes como si formases parte de un pequeño CRM de empresa.  
Está desarrollada en **Android Studio** con **Kotlin** y XML, implementando **persistencia local** mediante SQLite y una interfaz amigable y profesional.

---

## Funcionalidades Principales
- **Pantalla principal**
    - Visualización de la lista de clientes en un `RecyclerView`.
    - Total de clientes mostrado en un contador.
    - Barra de búsqueda para filtrar clientes en tiempo real por nombre o correo.
    - Botón flotante (FAB) para añadir nuevos clientes.
- **Formulario de cliente**
    - Campos obligatorios: Nombre, Correo y Teléfono.
    - Validaciones:
        - Todos los campos deben estar completos.
        - Correo con formato válido.
        - Teléfono con al menos 9 dígitos.
    - Botón “Guardar” para insertar o actualizar un cliente.
    - Opción para eliminar un cliente con confirmación.
- **Persistencia**
    - Uso de **SQLiteOpenHelper** para almacenar datos.
    - Carga automática de la información al iniciar la app.
    - Permite editar y eliminar registros existentes.

---

## Extras Implementados
- Filtro de clientes en tiempo real mediante la barra de búsqueda.
- Contador de clientes actualizado dinámicamente.
- Confirmación mediante **AlertDialog** antes de borrar un cliente.

---

## Tecnologías Utilizadas
- **Lenguaje:** Kotlin
- **IDE:** Android Studio
- **Persistencia:** SQLite (`SQLiteOpenHelper`)
- **UI:** XML + Material Design
- **Recyclerview y Adapter** para listas dinámicas
- **FloatingActionButton** para acciones rápidas

---

## Capturas de Pantalla
*Pantalla principal mostrando lista de clientes y contador:*

![Pantalla Principal](screenshots/pantalla_principal.png)

*Formulario de cliente con validaciones:*

![Formulario Cliente](screenshots/formulario_cliente.png)

*Confirmación de borrado de cliente:*

![Confirmación Borrado](screenshots/alert_borrar.png)

> Nota: Las imágenes deben guardarse en la carpeta `screenshots` dentro del proyecto para que se vean correctamente en el README.

---

## Instrucciones para Ejecutar el Proyecto
1. Clonar o descargar el proyecto.
2. Abrir con **Android Studio**.
3. Esperar a que se sincronicen las dependencias de Gradle.
4. Ejecutar en un emulador o dispositivo físico con **Android 7.0 (API 24)** o superior.
5. Interactuar con la app agregando, editando y eliminando clientes.

---

## Modelo de Datos
La app utiliza una tabla `clientes` en SQLite con la siguiente estructura:

| Campo    | Tipo     | Restricciones       |
|----------|----------|-------------------|
| id       | INTEGER  | PRIMARY KEY AUTOINCREMENT |
| nombre   | TEXT     | NOT NULL          |
| correo   | TEXT     | NOT NULL          |
| telefono | TEXT     | NOT NULL          |

---

## Autor
**Alejandro del Valle López** - Estudiante DAM  
Proyecto desarrollado como actividad del **2º curso de Desarrollo de Aplicaciones Multiplataforma**.

---

## Licencia
Este proyecto es de uso educativo. No distribuya sin permiso del autor.
