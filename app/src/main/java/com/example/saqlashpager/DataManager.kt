package com.example.saqlashpager

object DataManager {
    private val data = mutableListOf<String>()

    fun addData(item: String) {
        data.add(item)
    }

    fun getData(): List<String> {
        return data
    }
}