package ru.petrovich

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller(value = "/demo")
class DemoController {

    @Get(value = "/")
    @Produces(MediaType.APPLICATION_JSON)
    fun demo(): String {
        return "Hello world"
    }

}