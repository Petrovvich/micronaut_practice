package ru.petrovich

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller(value = "/demo")
object DemoController {

    @Get(value = "/")
    @Produces(MediaType.APPLICATION_JSON)
    fun demoGet(): String {
        return "Demo Hi!"
    }
}