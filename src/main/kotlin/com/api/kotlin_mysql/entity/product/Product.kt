package com.api.kotlin_mysql.entity.product

import com.api.kotlin_mysql.enums.DeliveryType
import com.api.kotlin_mysql.enums.ProductAvailability
import com.api.kotlin_mysql.enums.ProductType
import jakarta.persistence.*

@Entity
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "product_name")
    val name: String? = null,

    @Column(name = "product_type")
    val type: ProductType? = null,

    @Column(name = "description")
    val description: String? = null,

    @Column(name = "image_url")
    val imageUrl: String? = null,

    @Column(name = "price")
    val price: Double? = null,

    @Column(name = "availability")
    val availability: ProductAvailability? = null,

    @Column(name = "delivery_type")
    val deliveryType: DeliveryType? = null,

    @Column(name = "created_at")
    val createdAt: String? = null,

    @Column(name = "updated_at")
    val updatedAt: String? = null

    // Best approach on a list of other properties (thinking of nutritional facts for example) ?

)

