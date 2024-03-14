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
//    Esta clase es la que se encarga de manejar la vista de cada item de la lista
    inner class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foodImage: ImageView = itemView.findViewById(R.id.foodImage)
        val foodName: TextView = itemView.findViewById(R.id.foodName)

    }
//    Este metodo se encarga de crear la vista de cada item de la lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return FoodViewHolder(view)
    }
//    Este metodo se encarga de llenar la vista con la informacion de cada item de la lista
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foods[position]
        holder.foodName.text = food.name
//        Cargar la imagen con Picasso
        Picasso.get().load(food.image).into(holder.foodImage)
        holder.itemView.setOnClickListener {
            onClick(food)
        }
    }
//    Este metodo se encarga de regresar el numero de items que tiene la lista
    override fun getItemCount(): Int {
        return foods.size
    }
}