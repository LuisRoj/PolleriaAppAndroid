package com.example.polleriaappandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.polleriaappandroid.databinding.ItemProductoBinding

class ProductoAdapter (private var productos: MutableList<ProductoEntity>,
                       private var listener: OnClickListener) :
    RecyclerView.Adapter<ProductoAdapter.ViewHolder>() {

    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        mContext = parent.context

        val view = LayoutInflater.from(mContext).inflate(R.layout.item_producto, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val producto = productos.get(position)

        with(holder) {
            setListener(producto)
            binding.tvName.text = producto.name
            binding.cbFavorite.isChecked = producto.isFavorite
        }
    }

    override fun getItemCount(): Int = productos.size
    fun add(productoEntity: ProductoEntity) {
        productos.add(productoEntity)
        notifyDataSetChanged()
    }

    fun setProductos(productos: MutableList<ProductoEntity>) {
        this.productos = productos
        notifyDataSetChanged()
    }

    fun update(productoEntity: ProductoEntity) {
        val index = productos.indexOf(productoEntity)
        if (index != -1) {
            productos.set(index, productoEntity)
            notifyItemChanged(index)
        }
    }

    fun delete(productoEntity: ProductoEntity) {
        val index = productos.indexOf(productoEntity)
        if (index != -1) {
            productos.removeAt(index)
            notifyItemRemoved(index)
        }
    }

    // Clase interna inner class
    // Heredando de recycler
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Se debe sincronizar en graddle sino no aparece
        // Creamos la variable para que reciba de la vista
        val binding = ItemProductoBinding.bind(view)

        fun setListener(productoEntity: ProductoEntity) {
            with(binding.root) {
                setOnClickListener { listener.onClick(productoEntity) }
                setOnLongClickListener {
                    listener.onDeleteProducto(productoEntity)
                    true
                }
            }

            binding.cbFavorite.setOnClickListener {
                listener.onFavoriteProducto(productoEntity)
            }
        }

    }


}