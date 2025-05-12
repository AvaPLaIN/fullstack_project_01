package org.kevinvoss.fullstack.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, World!"
    }

    @PostMapping("/hello")
    fun postHello(): String {
        return "Hello, POST!"
    }

}