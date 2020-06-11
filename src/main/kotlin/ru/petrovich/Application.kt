package ru.petrovich

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("ru.petrovich")
                .mainClass(Application.javaClass)
                .start()
    }
}