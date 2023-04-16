package com.alexbryksin.ordersmicroservice.order.repository

import com.alexbryksin.ordersmicroservice.order.domain.ProductItemEntity

interface ProductItemBaseRepository {

    suspend fun insert(productItemEntity: ProductItemEntity): ProductItemEntity
    suspend fun insertAll(productItemEntities: List<ProductItemEntity>): List<ProductItemEntity>
}