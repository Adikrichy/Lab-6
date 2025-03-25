package com.example.myapplication6

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listViewCountries)

        // Подготавливаем список данных
        val countries = listOf(
            Country("Vietnam", 98000000, R.drawable.flag_vietnam),
            Country("United States", 320000000, R.drawable.flag_usa),
            Country("Russia", 142000000, R.drawable.flag_russia)
        )

        // Создаём адаптер
        val adapter = CountryAdapter(this, countries)

        // Устанавливаем адаптер для ListView
        listView.adapter = adapter
    }
}
