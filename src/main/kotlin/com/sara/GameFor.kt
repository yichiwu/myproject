package com.sara

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)

    val scanner = Scanner(System.`in`)
    for (i in 1..4) {
        print("Please enter a number (${i}/4): ")
        var number = scanner.nextInt()
        println("For ${i} time(s): $number")
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great! The number is $number")
            break
        }
    }
}