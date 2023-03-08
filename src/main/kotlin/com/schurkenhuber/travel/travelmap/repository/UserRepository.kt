package com.schurkenhuber.travel.travelmap.repository

import com.schurkenhuber.travel.travelmap.model.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : ReactiveCrudRepository<User, Long> {
    suspend fun findByAccessToken(accessToken: String) : User?
}
