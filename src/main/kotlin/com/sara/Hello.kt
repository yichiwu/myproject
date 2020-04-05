package com.sara

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    var h = Human(weight = 66.5f, height = 1.7f)
    println(h.bmi())
//    var name : String
//    name = "Hank"
}

class Human(var weight : Float, var height : Float) {

    fun bmi() : Float {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}