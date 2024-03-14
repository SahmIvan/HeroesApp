package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.squareup.picasso.Picasso
import com.example.heroesapp.models.Restaurant

class RestaurantAdapter
    (
    private val restaurants : List<Restaurant>,
    private val onClick: (Restaurant)->Unit
) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    class RestaurantViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.restaurant_image)
        val nameView: TextView = view.findViewById(R.id.restaurant_name)

    }
//    Este metodo se encarga de crear la vista de cada item de la lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_item, parent, false)
        return RestaurantViewHolder(view)
    }
//    Este metodo se encarga de regresar el numero de items que tiene la lista
    override fun getItemCount(): Int {
        return restaurants.size
    }
//    Este metodo se encarga de llenar la vista con la informacion de cada item de la lista
    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurants[position]
        holder.nameView.text = restaurant.name
        holder.view.setOnClickListener {
            onClick(restaurant)
        }
//        Cargar la imagen con Picasso
        Picasso.get().load(restaurant.image).into(holder.imageView)
    }


}