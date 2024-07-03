package com.example.polleriaappandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }



    private lateinit var fBinding: FragmentHomeBinding

    private lateinit var mAdapter: ProductoAdapter

    private lateinit var mGridLayout: GridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fBinding = FragmentHomeBinding.inflate(layoutInflater)
        setContentView(fBinding.root)

        fBinding.btnSave.setOnClickListener {
            val producto = ProductoEntity(name = fBinding.etName.text.toString().trim())

            // Se pone hilo para que se ejecute en segundo plano
            Thread {
                ProductoApplication.database.productoDao().addProducto(producto)
            }.start()
            // Agregando al Adaptador
            mAdapter.add(producto)
        }
        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        mAdapter = ProductoAdapter(mutableListOf(), this)
        mGridLayout = GridLayoutManager(this, 2)
        getProductos()

        fBinding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = mGridLayout
            adapter = mAdapter
        }
    }

    private fun getProductos() {
        val queue = LinkedBlockingQueue<MutableList<ProductoEntity>>()
        Thread {
            val productos = ProductoApplication.database.productoDao().getAllProductos()
            queue.add(productos)
        }.start()

        // mAdapter.setProductos(productos)
        mAdapter.setProductos(queue.take())
    }

    override fun onClick(productoEntity: ProductoEntity) {

    }

    override fun onFavoriteProducto(productoEntity: ProductoEntity) {
        productoEntity.isFavorite = !productoEntity.isFavorite
        val queue = LinkedBlockingQueue<ProductoEntity>()
        Thread {
            ProductoApplication.database.productoDao().updateProducto(productoEntity)
            queue.add(productoEntity)
        }.start()
        mAdapter.update(queue.take())
    }

    override fun onDeleteProducto(productoEntity: ProductoEntity) {
        val queue = LinkedBlockingQueue<ProductoEntity>()
        Thread {
            ProductoApplication.database.productoDao().deleteProducto(productoEntity)
            queue.add(productoEntity)
        }.start()
        mAdapter.delete(queue.take())
    }
*/


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


}
