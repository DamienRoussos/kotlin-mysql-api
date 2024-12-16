package com.api.kotlin_mysql.repository

import com.api.kotlin_mysql.entity.customer.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long>