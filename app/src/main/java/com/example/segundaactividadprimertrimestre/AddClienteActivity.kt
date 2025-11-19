package com.example.segundaactividadprimertrimestre

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddClienteActivity : AppCompatActivity() {

    private lateinit var dbHelper: ClienteDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_cliente)

        dbHelper = ClienteDBHelper(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val correo = etCorreo.text.toString()
            val telefono = etTelefono.text.toString()

            if (nombre.isBlank() || correo.isBlank() || telefono.isBlank()) {
                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
                Toast.makeText(this, "Correo inválido", Toast.LENGTH_SHORT).show()
            } else if (telefono.length < 9) {
                Toast.makeText(this, "El teléfono debe tener al menos 9 dígitos", Toast.LENGTH_SHORT).show()
            } else {
                dbHelper.insertarCliente(
                    Cliente(
                        nombre = nombre,
                        correo = correo,
                        telefono = telefono
                    )
                )
                Toast.makeText(this, "Cliente guardado", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
