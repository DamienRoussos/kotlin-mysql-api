package com.api.kotlin_mysql.service.implementations

import com.api.kotlin_mysql.entity.product.Product
import com.api.kotlin_mysql.service.interfaces.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl : ProductService {
    override fun createProduct(): Product {
        TODO("Not yet implemented")
    }

    override fun getAllProducts(): List<Product> {
        TODO("Not yet implemented")
    }

    override fun getProduct(productId: Long): Product {
        TODO("Not yet implemented")
    }

    override fun updateProduct(productId: Long, product: Product): Product {
        TODO("Not yet implemented")
    }

    override fun deleteProduct(productId: Long) {
        TODO("Not yet implemented")
    }
}