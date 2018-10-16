package com.example.sho.kotlinstartbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sho.kotlinstartbook.ranges.CharRange
import com.example.sho.kotlinstartbook.rational.Rational
import com.example.sho.kotlinstartbook.vararg.Vararg

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Rational
        val r = Rational(1, 2).plus(1)
        Log.d("ushi_debug", r.toString())

        // CharRange
        CharRange.tes()

        //vararg
        val arg = Vararg()
        arg.greeting("太郎", "花子")

        //
    }
}
