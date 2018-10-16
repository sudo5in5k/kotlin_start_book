package com.example.sho.kotlinstartbook.higherorder

import kotlin.reflect.KFunction1

/**
 * 高階関数の理解
 * 高階関数とは関数を引数として受け取ったり、返り値として関数を返したりする関数のこと
 *
 * Created by sho on 2018/10/16.
 */
class HigherOrder {

    companion object {
        fun <T> read(members: List<T>, someFunction: (T) -> Unit) {
            members.forEach(someFunction)
        }
    }
}