package com.example.first

class Carnivores(val size: Int, //рост в см
                 val name_carni: String, //название плотоядного
                 val food_carni: String, //чем питается
                 val color_carni: String, //цвет
                 val ground_carni: String) //среда обитания
{
    fun printName() {
        println(name_carni)
    }
}