package com.api.kotlin_mysql.service.interfaces

import com.api.kotlin_mysql.entity.product.Product
import org.springframework.stereotype.Service

@Service
interface ProductService {

    fun createProduct(): Product

    fun getProduct(productId: Long): Product

    fun getAllProducts(): List<Product>

    fun updateProduct(productId: Long, product: Product): Product

    fun deleteProduct(productId: Long)

}