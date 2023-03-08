package com.schurkenhuber.travel.travelmap.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/destinations")
class DestinationsController {
    @GetMapping("/demo")
    suspend fun printDemoMessage() = "It works!"
}
