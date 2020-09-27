package com.example.kotlinpracticeexercises

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    private val activityName = listOf<String>(
        "Obtener Área de Triángulo"
    )
    lateinit var activitiesList :ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initActivitiesList()
    }

    private fun initActivitiesList() {
        activitiesList = findViewById(R.id.ActivitiesList) as ListView // Initializes list of available programs
        val arrayAdapter = ArrayAdapter<String>(
            this,
            R.layout.activity_list_view,
            R.id.textView,
            this.activityName
        )
        this.activitiesList.adapter = arrayAdapter
        this.activitiesList.setOnItemClickListener { _, _, position, _ ->
            run {
                this.onActivitiesListItemClick(position)
            }
        }
    }

    private fun onActivitiesListItemClick(itemIndex: Int) {
        var item = this.activitiesList.get(itemIndex)
    }
}