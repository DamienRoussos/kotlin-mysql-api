package com.api.kotlin_mysql.service.interfaces

import com.api.kotlin_mysql.entity.store.Store
import org.springframework.stereotype.Service

@Service
interface StoreService {

    fun createStore(): Store

    fun getStore(storeId: Long): Store

    fun getAllStores(): List<Store>

    fun updateStore(storeId: Long, store: Store): Store

    fun deleteStore(storeId: Long)

}