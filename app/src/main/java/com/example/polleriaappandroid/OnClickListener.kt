package com.example.polleriaappandroid

interface OnClickListener {

    fun onClick(productoEntity: ProductoEntity)
    fun onFavoriteProducto(productoEntity: ProductoEntity)
    fun onDeleteProducto(productoEntity: ProductoEntity)
}