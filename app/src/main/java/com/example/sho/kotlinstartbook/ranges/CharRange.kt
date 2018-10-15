package com.example.sho.kotlinstartbook.ranges

import android.util.Log

/**
 * Char range 練習
 *
 * Created by sho on 2018/10/15.
 */
class CharRange {

    companion object {
        private val range: CharProgression = ('Y' downTo 'A')

        fun tes() {
            val bool = 'Z' in range
            Log.d("ushi_debug", "bool $bool")
            range.forEach {
                Log.d("ushi_debug", it.toString())
            }
        }
    }

}
