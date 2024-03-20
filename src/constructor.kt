class safaristuds(val jina:String,val miaka:Int,val jinsia:String ){

}

fun main(args: Array<String>) {
    val myobj=safaristuds("Ajumie",18,"female")
    println("My name is ${myobj.jina}")
    println("I am ${myobj.miaka} years old")
    println("I am a ${myobj.jinsia}")


    val myobj2=safaristuds("Peacent",19,"female")
    println("My name is ${myobj2.jina}")
    println("I am ${myobj2.miaka} years old")
    println("I am a ${myobj2.jinsia}")


    val myobj3=safaristuds("Flex",19,"Male")
    println("My name is ${myobj3.jina},I am ${myobj3.miaka} years old and I'm a ${myobj3.jinsia}")
}


