package com.example.heroesapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.FoodAdapter
import com.example.heroesapp.models.Food
import com.example.heroesapp.models.Restaurant

// Esta clase se encarga de manejar la vista de la pantalla de una casa de comics
class RestaurantActivity : AppCompatActivity() {
    private lateinit var restaurantName : TextView
    private lateinit var foodRecyclerView : RecyclerView
    private lateinit var foodIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        val restaurantId = intent.getIntExtra("restaurantId", 0)
        val restaurant = Restaurant.restaurants.find { it.id == restaurantId }
        val foods = Food.foods.filter { it.restaurantId == restaurantId }
        restaurantName = findViewById(R.id.restaurant_name)
        restaurantName.text = restaurant?.name
        foodRecyclerView = findViewById(R.id.foods_recyclerview)
        setUpRecyclerView(foods)
    }
//    Este metodo se encarga de llenar la lista de comida
    fun setUpRecyclerView(foods:List<Food>){
        foodRecyclerView.layoutManager = GridLayoutManager(this, 2)
        foodRecyclerView.adapter = FoodAdapter(foods){ food ->
            Log.i("MainActivity", "Food clicked: ${food.name}")
            foodIntent = Intent(this, FoodDetailActivity::class.java).apply {
                putExtra("foodId", food.id)
            }
            startActivity(foodIntent)
        }
    }
}