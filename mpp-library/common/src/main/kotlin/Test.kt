package ru.alex009

import ru.alex009.utils.CustomException
import ru.alex009.utils.functionWithCustomException
import ru.alex009.utils.justReturnPairOf

class Tester {
    fun testObjectReturn(): Any {
        return justReturnPairOf("first", "second")
    }

    fun testException(error: (Throwable) -> Unit) {
        try {
            functionWithCustomException()
        } catch (exc: Throwable) {
            error(exc)
        }
    }

    // if we just comment this lines Pair & CustomException not write to framework header
    val pair = Pair<String, String>("test", "test")
    val exc = CustomException()
}
