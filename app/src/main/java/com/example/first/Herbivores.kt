package com.example.first

class Herbivores(val size: Int, //рост в см
                 val name_herbi: String, //название травоядного
                 val food_herbi: String, //еда травоядного
                 val type_carni: String, //покрытие кожи
                 val ground_carni: String) //среда обитания
{
    fun printName () {
        println(name_herbi)
    }
}