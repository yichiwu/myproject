package com.sara

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)

//    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("Please enter a number: ")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number < secret) {
            println("Higher")
        } else if (number > secret) {
            println("Lower")
        } else {
            println("Great! The number is $number")
        }
    }
}