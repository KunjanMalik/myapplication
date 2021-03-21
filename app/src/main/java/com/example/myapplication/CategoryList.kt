package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class CategoryList : AppCompatActivity() {

    val language = arrayOf<String>("Workout","Nutrition","Yoga","Cardio","Meditation")
    val imageId = arrayOf<Int>(
        R.drawable.workout,R.drawable.nutrition,R.drawable.yoga,
        R.drawable.cardio,R.drawable.workout
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_list)

        val listView: ListView = findViewById(R.id.categoryListView)

        val myListAdapterCategory = MyListAdapterCaterory(this,language,imageId)
        listView.adapter = myListAdapterCategory

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Listing_page::class.java)
            startActivity(intent)
        }
    }
}