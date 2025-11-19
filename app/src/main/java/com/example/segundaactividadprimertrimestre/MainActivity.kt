package com.example.segundaactividadprimertrimestre

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var dbHelper: ClienteDBHelper
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ClienteAdapter
    private lateinit var tvContador: TextView
    private lateinit var etBuscar: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = ClienteDBHelper(this)

        // Contador y búsqueda
        tvContador = findViewById(R.id.tvContador)
        etBuscar = findViewById(R.id.etBuscar) // asegúrate de añadir un EditText en el layout para buscar

        // RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Cargar clientes iniciales
        var clientes = dbHelper.obtenerClientes().toMutableList()
        if (clientes.isEmpty()) {
            dbHelper.insertarCliente(
                Cliente(nombre = "Alejandro", correo = "alejandro.delvalle@pro2fp.es", telefono = "644553001")
            )
        }

        clientes = dbHelper.obtenerClientes().toMutableList()
        adapter = ClienteAdapter(clientes, this)
        recyclerView.adapter = adapter

        actualizarContador()

        // FAB para añadir cliente
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this, AddClienteActivity::class.java)
            startActivity(intent)
        }

        // Búsqueda en tiempo real
        etBuscar.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filtrarClientes(s.toString())
            }
        })
    }

    override fun onResume() {
        super.onResume()
        cargarClientes()
    }

    private fun cargarClientes() {
        val listaClientes = dbHelper.obtenerClientes().toMutableList()
        adapter.actualizarLista(listaClientes)
        actualizarContador()
    }

    private fun actualizarContador() {
        val total = dbHelper.obtenerClientes().size
        tvContador.text = "Total clientes: $total"
    }

    private fun filtrarClientes(texto: String) {
        val listaFiltrada = dbHelper.obtenerClientes().filter {
            it.nombre.contains(texto, ignoreCase = true) ||
                    it.correo.contains(texto, ignoreCase = true)
        }.toMutableList()
        adapter.actualizarLista(listaFiltrada)
    }
}
