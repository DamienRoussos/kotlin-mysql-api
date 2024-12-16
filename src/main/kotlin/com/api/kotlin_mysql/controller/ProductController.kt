package com.api.kotlin_mysql.controller

import com.api.kotlin_mysql.entity.product.Product
import com.api.kotlin_mysql.service.interfaces.ProductService
import org.springframework.web.bind.annotation.*

@RestController("/product")
class ProductController(
    private val productService: ProductService
) {
    @PostMapping("/create")
    fun createProduct(@RequestBody product: Product): Product = productService.createProduct()

    @GetMapping("/{productId}")
    fun getProduct(@PathVariable productId: Long): Product = productService.getProduct(productId)

    @GetMapping("/productlist")
    fun getAllProducts(): List<Product> = productService.getAllProducts()

    @PutMapping("/{productId}")
    fun updateProduct(@PathVariable productId: Long, @RequestBody product: Product): Product =
        productService.updateProduct(productId, product)

    @DeleteMapping("/{productId}")
    fun deleteProduct(@PathVariable productId: Long) = productService.deleteProduct(productId)
}