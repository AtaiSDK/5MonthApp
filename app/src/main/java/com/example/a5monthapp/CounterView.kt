package com.example.a5monthapp

interface CounterView {
    fun showCount(count: Int)
    fun showToast(congratulations: String)
    fun darkTheme()
    fun lightTheme()
    fun changeColor()
}