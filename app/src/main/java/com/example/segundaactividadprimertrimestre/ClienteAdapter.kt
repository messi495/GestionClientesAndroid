package com.example.segundaactividadprimertrimestre

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClienteAdapter(
    private var clientes: MutableList<Cliente>,  // mutable y var
    private val context: Context
) : RecyclerView.Adapter<ClienteAdapter.ViewHolder>() {

    // ViewHolder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.tvNombre)
        val correo: TextView = itemView.findViewById(R.id.tvCorreo)
        val telefono: TextView = itemView.findViewById(R.id.tvTelefono)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cliente, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cliente = clientes[position]
        holder.nombre.text = cliente.nombre
        holder.correo.text = cliente.correo
        holder.telefono.text = cliente.telefono
    }

    override fun getItemCount(): Int = clientes.size

    // Método para actualizar la lista del RecyclerView
    fun actualizarLista(nuevaLista: MutableList<Cliente>) {
        clientes.clear()
        clientes.addAll(nuevaLista)
        notifyDataSetChanged()
    }
}
