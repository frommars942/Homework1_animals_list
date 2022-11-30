class MeatEater(
    name: String,
    family: String,
    age: Int,
    weight: Double,
    isAnimalEatMeat: Boolean,
    val jawsPowerLevel_N: Int
): Animal(name, family, age, weight, isAnimalEatMeat) {
}