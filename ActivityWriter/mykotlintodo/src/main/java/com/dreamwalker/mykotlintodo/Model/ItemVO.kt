package com.dreamwalker.mykotlintodo.Model

abstract class ItemVO {
    abstract val type : Int
    companion object {
        const val TYPE_HEADER = 0
        const val TYPE_DATA = 1
    }
}