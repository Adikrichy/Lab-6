package com.example.myapplication6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CountryAdapter(
    private val context: Context,
    private val countryList: List<Country>
) : BaseAdapter() {

    override fun getCount(): Int {
        return countryList.size
    }

    override fun getItem(position: Int): Any {
        return countryList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Если есть уже созданный View (convertView), переиспользуем его
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.list_item_country, parent, false)

        // Получаем текущий элемент
        val country = countryList[position]

        // Находим нужные элементы интерфейса
        val imageFlag = view.findViewById<ImageView>(R.id.imageFlag)
        val textName = view.findViewById<TextView>(R.id.textCountryName)
        val textPopulation = view.findViewById<TextView>(R.id.textPopulation)

        // Заполняем данными
        imageFlag.setImageResource(country.flagResId)
        textName.text = country.name
        textPopulation.text = "Population: ${country.population}"

        return view
    }
}
