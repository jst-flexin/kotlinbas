class kinya {

    //data member
    var nambari1 = 8
    var nambari2 = 7

    //member function
    fun add(): Int {
        return nambari1 + nambari2
    }
}

fun main(args: Array<String>) {
//    instance of my object

    val myobj=kinya()
    println(myobj.add())


}