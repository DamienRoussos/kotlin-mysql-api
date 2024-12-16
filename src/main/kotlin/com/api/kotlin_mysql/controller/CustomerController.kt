package com.api.kotlin_mysql.controller

import com.api.kotlin_mysql.entity.customer.Customer
import com.api.kotlin_mysql.service.interfaces.CustomerService
import org.springframework.web.bind.annotation.*

@RestController("/customer")
class CustomerController(
    private val customerService: CustomerService,
) {
    @PostMapping("/signup")
    fun createCustomer(@RequestBody customer: Customer): Customer = customerService.createCustomer()

    @GetMapping("/{customerId}")
    fun getCustomer(@PathVariable customerId: Long): Customer = customerService.getCustomer(customerId)

    @GetMapping("/customerlist")
    fun getAllCustomers(): List<Customer> = customerService.getAllCustomers()

    @PutMapping("/{customerId}")
    fun updateCustomer(@PathVariable customerId: Long, @RequestBody customer: Customer): Customer =
        customerService.updateCustomer(customerId, customer)

    @DeleteMapping("/{customerId}")
    fun deleteCustomer(@PathVariable customerId: Long) = customerService.deleteCustomer(customerId)
}