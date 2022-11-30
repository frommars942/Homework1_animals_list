class PlantEater(
    name: String,
    family: String,
    age: Int,
    weight: Double,
    isAnimalEatMeat: Boolean,
    val dailyPlantsAmount_kg: Int,
): Animal (name, family, age, weight, isAnimalEatMeat) {
}