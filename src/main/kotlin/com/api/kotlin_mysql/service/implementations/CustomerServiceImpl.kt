package com.api.kotlin_mysql.service.implementations

import com.api.kotlin_mysql.entity.customer.Customer
import com.api.kotlin_mysql.repository.CustomerRepository
import com.api.kotlin_mysql.service.interfaces.CustomerService
import org.springframework.stereotype.Service

// What is a proper way to check that a customer doesn't exist? Just by id? what if a user signs up for another time, and then we have a duplicate?

@Service
class CustomerServiceImpl(private val repository: CustomerRepository) : CustomerService {
    override fun createCustomer(): Customer {
        TODO("Not yet implemented")
    }

    override fun getCustomer(customerId: Long): Customer {
        val customer = repository.findById(customerId)
        return if(customer.get().id == customerId) {
            customer.get()
        } else {
            throw Exception("Customer not found")
        }
    }

    override fun getAllCustomers(): List<Customer> {
        return repository.findAll().toList()
    }

    override fun updateCustomer(customerId: Long, customer: Customer): Customer {
        TODO("Not yet implemented")
    }

    override fun deleteCustomer(customerId: Long) {
        TODO("Not yet implemented")
    }
}