//parent class
open class Animal(val name:String) {
    open fun makesound() {
        println("$name makes a sound")
    }

    //child class inheriting from animal
    class dog(name: String) :
        Animal(name) {
        override fun makesound() {
            println("$name barks")
        }
    }

    fun main(args: Array<String>) {
        val animal = Animal("Generic animal")
        animal.makesound()
        val dog = dog("Buddy")
        dog.makesound()
    }
}