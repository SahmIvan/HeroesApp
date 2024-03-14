package com.example.heroesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.adapters.FoodAdapter
import com.example.heroesapp.adapters.RestaurantAdapter
import com.example.heroesapp.models.Food
import com.example.heroesapp.models.Restaurant
import com.example.heroesapp.ui.FoodDetailActivity
import com.example.heroesapp.ui.RestaurantActivity
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView

    private lateinit var foodRecyclerView: RecyclerView
    private lateinit var logOutImg: ImageView
    private lateinit var intent:Intent
    private lateinit var foodIntent: Intent
    private lateinit var logoutBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("myprefs", MODE_PRIVATE)
        recyclerView = findViewById(R.id.restaurant_recycler_view)
        foodRecyclerView = findViewById(R.id.food_recycler_view)
        logOutImg = findViewById(R.id.logoutButton)
        logoutBtn = findViewById(R.id.logoutBtn)
        logOutImg.setOnClickListener {
            Snackbar.make(logOutImg, "Log out clicked", Snackbar.LENGTH_LONG).show()
        }
        setUpRecyclerView()

        setUpFoodRecyclerView()

        logoutBtn.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", false)
            editor.apply()
            val intent = Intent(this@MainActivity,login::class.java)
            startActivity(intent)
            finish()
        }


    }

    private fun setUpFoodRecyclerView() {
        foodRecyclerView.layoutManager = GridLayoutManager(this, 2)
        val foods = Food.foods.filter { it.rating > 4.5 }
        foodRecyclerView.adapter = FoodAdapter(foods){ food ->
            Log.i("MainActivity", "Food clicked: ${food.name}")
            foodIntent = Intent(this, FoodDetailActivity::class.java).apply {
                putExtra("foodId", food.id)
            }
            startActivity(foodIntent)
        }
    }



    private fun setUpRecyclerView() {
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = RestaurantAdapter(Restaurant.restaurants){restaurant ->
            Log.i("MainActivity", "Restaurant clicked: ${restaurant.name}")
            intent = Intent(this, RestaurantActivity::class.java).apply {
                putExtra("restaurantId", restaurant.id)
            }
            startActivity(intent)
        }
    }
}