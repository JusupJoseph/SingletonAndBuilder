package com.example.singletonandbuilder

data class Human(
    val name: String,
    val age: Int
)

class HumanBuilder() {
    var name = "Jusup"
    var age = 17

    fun name(value: String): HumanBuilder {
        this.name = value
        return this
    }

    fun age(value: Int): HumanBuilder {
        this.age = value
        return this
    }

    fun bild(): Human = Human(
        name = name,
        age = age
    )
}
