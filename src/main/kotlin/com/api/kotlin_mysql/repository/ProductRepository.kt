package com.api.kotlin_mysql.repository

import com.api.kotlin_mysql.entity.product.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long>