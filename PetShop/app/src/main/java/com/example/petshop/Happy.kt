package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun describeMood(): String {
        return "I am feeling Happy"
    }
}