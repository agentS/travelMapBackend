package com.schurkenhuber.travel.travelmap.service

import com.schurkenhuber.travel.travelmap.dto.UserDto

interface UserService {
    suspend fun findByAccessToken(accessToken: String): UserDto?
}
