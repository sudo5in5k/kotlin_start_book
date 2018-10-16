package com.example.sho.kotlinstartbook.vararg

import android.util.Log

/**
 * 可変長引数の練習
 *
 * Created by sho on 2018/10/16.
 */
class Vararg {

    fun greeting(vararg strings: String) {
        strings.forEach {
            Log.d("ushi_debug", "Hello $it")
        }
    }
}