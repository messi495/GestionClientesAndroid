package com.example.segundaactividadprimertrimestre

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ClienteDBHelper(context: Context) : SQLiteOpenHelper(context, "clientesDB", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = """
            CREATE TABLE clientes (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT NOT NULL,
                correo TEXT NOT NULL,
                telefono TEXT NOT NULL
            )
        """.trimIndent()
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS clientes")
        onCreate(db)
    }

    fun insertarCliente(cliente: Cliente): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("nombre", cliente.nombre)   // columna "nombre"
            put("correo", cliente.correo)   // columna "correo"
            put("telefono", cliente.telefono) // columna "telefono"
        }
        return db.insert("clientes", null, values)
    }

    fun obtenerClientes(): MutableList<Cliente> {
        val lista = mutableListOf<Cliente>()
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM clientes", null)
        if (cursor.moveToFirst()) {
            do {
                lista.add(
                    Cliente(
                        id = cursor.getInt(cursor.getColumnIndexOrThrow("id")),
                        nombre = cursor.getString(cursor.getColumnIndexOrThrow("nombre")),
                        correo = cursor.getString(cursor.getColumnIndexOrThrow("correo")),
                        telefono = cursor.getString(cursor.getColumnIndexOrThrow("telefono"))
                    )
                )
            } while (cursor.moveToNext())
        }
        cursor.close()
        return lista
    }
}

