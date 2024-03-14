package com.example.heroesapp.models

//Esta clase es un modelo de datos que reppresenta a una casa de comics
data class Restaurant(val id: Int,val name:String,val image:String){
    companion object{
        val restaurants = mutableListOf<Restaurant>(
            Restaurant(1,"DC  ","https://www.pngall.com/wp-content/uploads/13/DC-Logo-PNG-Images-HD.png"),
            Restaurant(2,"Marvel","https://www.pngall.com/wp-content/uploads/13/Marvel-Logo-PNG-Images.png"),

            )
    }
}
