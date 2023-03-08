package com.schurkenhuber.travel.travelmap.dto.cdi

import com.schurkenhuber.travel.travelmap.dto.UserDto
import com.schurkenhuber.travel.travelmap.model.User
import com.schurkenhuber.travel.travelmap.repository.UserRepository
import com.schurkenhuber.travel.travelmap.service.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserServiceCdi(val userRepository: UserRepository) : UserService {
    companion object {
        private fun mapToDto(user: User): UserDto = UserDto(
            user.id ?: (-1),
            user.accessToken,
        )
    }

    override suspend fun findByAccessToken(accessToken: String): UserDto? {
        val user = this.userRepository.findByAccessToken(accessToken)
        return if (user != null) mapToDto(user) else null
    }
}