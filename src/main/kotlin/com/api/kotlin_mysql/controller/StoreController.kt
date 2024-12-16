package com.api.kotlin_mysql.controller

import com.api.kotlin_mysql.entity.store.Store
import com.api.kotlin_mysql.service.interfaces.StoreService
import org.springframework.web.bind.annotation.*

@RestController("/store")
class StoreController(
    private val storeService: StoreService
) {
    @PostMapping("/signup")
    fun createStore(@RequestBody store: Store): Store = storeService.createStore()

    @GetMapping("/{storeId}")
    fun getStore(@PathVariable storeId: Long): Store = storeService.getStore(storeId)

    @GetMapping("/storelist")
    fun getAllStores(): List<Store> = storeService.getAllStores()

    @PutMapping("/{storeId}")
    fun updateStore(@PathVariable storeId: Long, @RequestBody store: Store): Store =
        storeService.updateStore(storeId, store)

    @DeleteMapping("/{storeId}")
    fun deleteStore(@PathVariable storeId: Long) = storeService.deleteStore(storeId)
}