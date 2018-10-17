package com.example.sho.kotlinstartbook.recursive

/**
 * TODO クラス説明
 *
 * Created by sho on 2018/10/16.
 */
class Recursive {

    fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            2 -> 1
            else -> fibonacci(n - 2) + fibonacci(n - 1)
        }
    }
}