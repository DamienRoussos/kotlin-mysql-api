package com.api.kotlin_mysql.entity.store

import com.api.kotlin_mysql.enums.DeliveryType
import com.api.kotlin_mysql.enums.StoreType
import jakarta.persistence.*

// Why is every column null initially?
// Is it ok to use one enum for two different entities? In DB Enum or String? How to map specific options?

@Entity
data class Store(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "store_name")
    val name: String? = null,

    @Column(name = "store_type")
    val type: StoreType? = null,

    @Column(name = "description", length = 10000)
    val description: String? = null,

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

    @Column(name = "image_url")
    val imageUrl: String? = null,

    @Column(name = "web_url")
    val webUrl: String? = null,

    @Column(name = "delivery_type")
    val deliveryType: DeliveryType? = null

)
