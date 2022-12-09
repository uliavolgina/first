package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Плотоядные")
        val tiger = Carnivores(130, "тигр", "мясо", "рыжий", "джунгли")
        val cat = Carnivores(80, "кошка", "рыба", "цветной", "дом")

        println("Травоядные")
        val horse = Herbivores(178, "лошадь", "овёс",  "ворс", "поле")
        val squirrel = Herbivores(15, "белка", "орехи",  "шерсть", "лес")

        val list = listOf(tiger, cat, horse, squirrel)
        println(list)

    }
}