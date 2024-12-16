package com.api.kotlin_mysql.service.implementations

import com.api.kotlin_mysql.entity.store.Store
import com.api.kotlin_mysql.service.interfaces.StoreService
import org.springframework.stereotype.Service

@Service
class StoreServiceImpl : StoreService {
    override fun createStore(): Store {
        TODO("Not yet implemented")
    }

    override fun getStore(storeId: Long): Store {
        TODO("Not yet implemented")
    }

    override fun getAllStores(): List<Store> {
        TODO("Not yet implemented")
    }

    override fun updateStore(storeId: Long, store: Store): Store {
        TODO("Not yet implemented")
    }

    override fun deleteStore(storeId: Long) {
        TODO("Not yet implemented")
    }
}