package com.schurkenhuber.travel.travelmap.controller

import com.schurkenhuber.travel.travelmap.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/destinations")
class DestinationsController(val userService: UserService) {
    @GetMapping("/demo")
    suspend fun printDemoMessage(): String {
        val user = userService.findByAccessToken("asdf")
        return if (user != null) "Found!" else "Still searching..."
    }
}
