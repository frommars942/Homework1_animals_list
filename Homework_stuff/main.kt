fun main() {
    // objs init
    val animal1: PlantEater = PlantEater("Cow", "Bos Taurus", 4, 141.28, false, 15)
    val animal2: PlantEater = PlantEater("Elephant", "Elephantidae", 14, 550.0, false, 30)
    val animal3: MeatEater = MeatEater("Tiger", "Felidae", 9, 120.5, true, 310)
    val animal4: MeatEater = MeatEater("Lion", "Felidae", 5, 165.25, true, 350)

    // new list
    //val animalList = mutableListOf<Animal>()
    //animalList.addAll(mutableListOf(animal1, animal2, animal3, animal4))
    val animalList = mutableListOf<Animal>(animal1, animal2, animal3, animal4)

    // check our list
    checkAnimalList(animalList)
}

fun checkAnimalList(animalList: MutableList<Animal>) {

    for ((index, value) in animalList.withIndex()) {
        println("Animal #${index+1} name is ${value.name}, " +
                "family is ${value.family}, " +
                "age is ${value.age}, " +
                "weight is ${value.weight}, " +
                "${ if(!value.isAnimalEatMeat) { 
                    "animal eats plants and needs around ${(value as PlantEater).dailyPlantsAmount_kg}kg each day."}
                    else {
                        "animal have jaws strength around ${(value as MeatEater).jawsPowerLevel_N} newtons."} 
                }"
        )
    }
}