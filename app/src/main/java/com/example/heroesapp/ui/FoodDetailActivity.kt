package com.example.heroesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.heroesapp.R
import com.example.heroesapp.models.Food
import com.squareup.picasso.Picasso

class FoodDetailActivity : AppCompatActivity() {
    private lateinit var foodImageView: ImageView
    private lateinit var foodName: TextView
    private lateinit var foodDescription: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
        foodImageView = findViewById(R.id.burgerImage)
        foodName = findViewById(R.id.food_title)
        foodDescription = findViewById(R.id.food_description)
        val foodId = intent.getIntExtra("foodId", 0)
        Food.foods.find { it.id == foodId }.let { food: Food? ->
            Picasso.get().load(food?.image).into(foodImageView)
            foodName.text = food?.name
            foodDescription.text = food?.description
        }
    }
}