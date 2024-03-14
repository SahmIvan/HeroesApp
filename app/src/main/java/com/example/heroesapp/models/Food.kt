package com.example.heroesapp.models

data class Food(
    val id: Int,
    val name: String,

    val description: String,
    val image: String,
    val rating: Double,
    val restaurantId: Int) {


    companion object {
        val foods = mutableListOf<Food>(
            // Marvel Foods
            Food(1, "Spider-Man", "Peter Parker equilibra su vida como estudiante y héroe enmascarado en Nueva York.",
                "https://pngbuy.com/wp-content/uploads/2023/05/transparent-spiderman-png.png", 4.8, 2),
            Food(2, "Iron Man", "Tony Stark lucha contra el crimen como Iron Man mientras dirige Stark Industries.",
                "https://ongpng.com/wp-content/uploads/2023/04/7.ironman-784x768-1.png", 4.9, 2),
            Food(3, "Thor", "Thor, el príncipe de Asgard, protege la Tierra y los Nueve Reinos de amenazas cósmicas.",
                "https://www.pngfind.com/pngs/b/53-539789_thor-png-image-with-transparent-background-thor-marvel.png", 4.7, 2),
            Food(4, "Captain America", "Steve Rogers lidera a los Vengadores como el patriótico y valiente Capitán América.",
                "https://www.picng.com/upload/captain_america/png_captain_america_74257.png", 4.6, 2),
            Food(5, "Black Widow", "Natasha Romanoff es una hábil espía y miembro fundamental de los Vengadores.",
                "https://upload.wikimedia.org/wikipedia/en/thumb/1/1b/Black_Widow_1.png/220px-Black_Widow_1.png", 4.5, 2),
            Food(6, "Hulk", "Bruce Banner se transforma en el gigantesco y poderoso Hulk cuando se enfurece.",
                "https://pngfre.com/wp-content/uploads/hulk-poster.png", 4.4, 2),
            Food(7, "Doctor Strange", "Stephen Strange protege la realidad de amenazas místicas como el Hechicero Supremo.",
                "https://eltallerdehector.com/wp-content/uploads/2023/04/Dr-Strange-png.png", 4.2, 2),
            Food(8, "Black Panther", "T'Challa protege Wakanda y su legado como el enmascarado Black Panther.",
                "https://pngfre.com/wp-content/uploads/Black-Panther-16.png", 4.6, 2),
            Food(9, "Captain Marvel", "Carol Danvers es una poderosa heroína que protege la Tierra de amenazas extraterrestres.",
                "https://freepngimg.com/download/captain_marvel/37621-3-captain-marvel-clipart.png", 4.2, 2),
            Food(10, "Wolverine", "Logan es un mutante con un esqueleto reforzado de adamantium y habilidades de combate excepcionales.",
                "https://www.picng.com/upload/wolverine/png_wolverine_44842.png", 4.1, 2),

            // DC Foods
            Food(11, "Superman", "Clark Kent protege Metrópolis como el poderoso Superman, el Hombre de Acero.",
                "https://www.picng.com/upload/superman/png_superman_77196.png", 4.9, 1),
            Food(12, "Batman", "Bruce Wayne lucha contra el crimen en Gotham City como el vigilante enmascarado Batman.",
                "https://pngbuy.com/wp-content/uploads/2023/05/batman-png-1.png", 4.8, 1),
            Food(13, "Wonder Woman", "Diana Prince es una princesa amazona y una de las mayores heroínas del mundo.",
                "https://seeklogo.com/images/W/wonder-woman-logo-297B7097EA-seeklogo.com.png", 4.7, 1),
            Food(14, "The Flash", "Barry Allen protege Central City como el veloz héroe conocido como The Flash.",
                "https://pngfre.com/wp-content/uploads/the-flash-42-240x300.png", 4.6, 1),
            Food(15, "Aquaman", "Arthur Curry es el rey de Atlantis y defensor de los océanos como Aquaman.",
                "https://static.wikia.nocookie.net/vsbattles/images/9/94/Aquaman_Rebirth_TR.png/revision/latest?cb=20200328070553", 4.7, 1),
            Food(16, "Green Lantern", "Hal Jordan es uno de los protectores del universo como miembro de los Green Lantern Corps.",
                "https://upload.wikimedia.org/wikipedia/en/9/90/Green_Lantern_%28Hal_Jordan%29.png", 4.2, 1),
            Food(17, "Shazam", "Billy Batson se transforma en el poderoso Shazam al pronunciar su nombre mágico.",
                "https://static.wikia.nocookie.net/death-battle-fanon-wiki-en-espanol/images/c/c7/Shazam.png/revision/latest?cb=20190411001751&path-prefix=es", 4.4, 1),
            Food(18, "Cyborg", "Victor Stone es un mitad humano, mitad máquina con habilidades tecnológicas y físicas mejoradas.",
                "https://static.wikia.nocookie.net/goldbattles/images/8/81/N52_Cyborg.png/revision/latest?cb=20230116174520", 4.2, 1),
            Food(19, "Green Arrow", "Oliver Queen protege Star City como el arquero justiciero conocido como Green Arrow.",
                "https://upload.wikimedia.org/wikipedia/en/d/df/Green_Arrow_%28Connor_Hawke%29.png", 4.1, 1),
            Food(20, "Black Adam", "Del antiguo Egipto, Teth-Adam es un poderoso antihéroe con habilidades mágicas y físicas mejoradas.",
                "https://i.pinimg.com/originals/84/88/7e/84887ee9c1bbb4c56f823be35013d7d4.png", 4.1, 1)

        )
    }
}
