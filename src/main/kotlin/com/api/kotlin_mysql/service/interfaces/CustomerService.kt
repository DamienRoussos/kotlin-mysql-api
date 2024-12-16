package com.api.kotlin_mysql.service.interfaces

import com.api.kotlin_mysql.entity.customer.Customer
import org.springframework.stereotype.Service

@Service
interface CustomerService {

    fun createCustomer(): Customer

    fun getCustomer(customerId: Long): Customer

    fun getAllCustomers(): List<Customer>

    fun updateCustomer(customerId: Long, customer: Customer): Customer

    fun deleteCustomer(customerId: Long)
}