package com.example.sho.kotlinstartbook.rational

/**
 * TODO クラス説明
 *
 * Created by sho on 2018/10/12.
 */
class Rational(n: Int, d: Int) {
    init {
        require(d != 0, { "dont use 0" })
    }

    private val g by lazy { gcd(n, d) }
    private val numerator: Int by lazy { n / g }
    private val denominator: Int by lazy { d / g }

    operator fun plus(that: Rational): Rational = Rational(
            n = numerator + that.numerator * denominator,
            d = denominator * that.denominator
    )

    operator fun plus(n: Int): Rational = Rational(
            n = numerator + n, d = denominator
    )

    override fun toString(): String = "${numerator}/${denominator}"

    tailrec private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}

operator fun Int.plus(r: Rational): Rational = r + this
