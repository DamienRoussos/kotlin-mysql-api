package com.api.kotlin_mysql.entity.customer

import com.api.kotlin_mysql.enums.CustomerType
import jakarta.persistence.*

@Entity
data class Customer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "first_name")
    val firstName: String? = null,

    @Column(name = "last_name")
    val lastName: String? = null,

    @Column(name = "address_name")
    val addressName: String? = null,

    @Column(name = "address_number")
    val addressNumber: String? = null,

    @Column(name = "postal_code")
    val postalCode: String? = null,

    @Column(name = "city")
    val city: String? = null,

    @Column(name = "country")
    val country: String? = null,

    @Column(name = "country_code")
    val countryCode: String? = null,

    @Column(name = "phone_number")
    val phoneNumber: String? = null,

    @Column(name = "email")
    val email: String? = null,

    @Column(name = "password")
    val password: String? = null,

    @Column(name = "customer_type")
    val type: CustomerType? = null,

    @Column(name = "created_at")
    val createdAt: String? = null,

    @Column(name = "updated_at")
    val updatedAt: String? = null

    )