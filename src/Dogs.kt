class Dog(val name: String, weight_param: Int, breed_param: String){
    init {
        print("Dog $name has been created. ")
    }
    var activites = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    init {
        println("The breed is $breed.")
    }
    var weight = weight_param
        set(value){
            if (value > 0) field = value
        }
    val Kgs: Double
        get() = weight / 2.2
    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>){
    val myDog = Dog("John",88,"Husky")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.Kgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activites = arrayOf("Walks","Fetching balls","Frisbee")
    for(item in myDog.activites){
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dog("Jake",20,"Poodle"), Dog("Ripper",95,"Shepherd"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}