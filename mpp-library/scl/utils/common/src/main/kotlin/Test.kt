package ru.alex009.utils

fun justReturnPairOf(first: String, second: String): Pair<String, String> {
    return Pair(first, second)
}

fun functionWithCustomException() {
    throw CustomException()
}

class CustomException : Exception("this is custom exception")
