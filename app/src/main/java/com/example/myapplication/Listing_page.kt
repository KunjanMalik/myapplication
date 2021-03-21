package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class Listing_page : AppCompatActivity() {

    val language = arrayOf<String>("Chest Workout","Arms Workout","Shoulders Workout","Abs Workout","Legs Workout")
    val description = arrayOf<String>(
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum"
    )
    val imageId = arrayOf<Int>(
        R.drawable.workout,R.drawable.nutrition,R.drawable.yoga,
        R.drawable.cardio,R.drawable.workout
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing_page)

        val listView: ListView = findViewById(R.id.listView)

        val myListAdapter = MyListAdapter(this,language,description,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }
}