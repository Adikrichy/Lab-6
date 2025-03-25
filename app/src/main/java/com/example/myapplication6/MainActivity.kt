package com.example.myapplication6

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.MyApplication6) // или прописано в манифесте
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewCountries)
        val countries = listOf(
            Country("Vietnam", 98000000, R.drawable.flag_vietnam),
            Country("United States", 320000000, R.drawable.flag_usa),
            Country("Russia", 142000000, R.drawable.flag_russia)
        )

        val adapter = CountryAdapter(this, countries)
        listView.adapter = adapter

        // Убираем стандартный разделитель
        listView.divider = null
        listView.dividerHeight = 0
    }
}

