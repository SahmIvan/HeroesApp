package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.squareup.picasso.Picasso
import com.example.heroesapp.models.Food

class FoodAdapter(private val foods:List<Food>, val onClick:(Food)->Unit): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>()
{
    inner class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foodImage: ImageView = itemView.findViewById(R.id.foodImage)
        val foodName: TextView = itemView.findViewById(R.id.foodName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foods[position]
        holder.foodName.text = food.name

        Picasso.get().load(food.image).into(holder.foodImage)
        holder.itemView.setOnClickListener {
            onClick(food)
        }
    }

    override fun getItemCount(): Int {
        return foods.size
    }
}