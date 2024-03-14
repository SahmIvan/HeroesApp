package com.example.heroesapp.mock
import com.example.heroesapp.models.User
class MockData {
//    Esta clase es un mock de datos que simula una base de datos
    companion object{
        val users = listOf<User>(
            User("ivan123@gmail.com", "123"),
            User("jassiel123@gmail.com", "123"),
            User("ija123@gmail.com", "123")
        )
    }
}