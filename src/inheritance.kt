open class mzazi{
    var dad="He likes watching football."
    var mom="She likes cooking."



}
class girl:mzazi(){
fun cook(){
    println(mom)
}

}
class boy:mzazi(){
fun ballz(){
    println(dad)
}


}

fun main(args: Array<String>) {
    val obj1=girl()
    obj1.cook()

    val obj2=boy()
    obj2.ballz()
}