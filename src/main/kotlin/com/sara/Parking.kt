package com.sara

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(2020,7,9,8,0,0)
    val leave = LocalDateTime.of(2020,7,9,10,0,0)
    var car = Car("AAA-0001", enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = leave
        }
    fun duration() = Duration.between(enter, leave).toMinutes()
}