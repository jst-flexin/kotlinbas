fun main(args: Array<String>) {
    var myarr= arrayOf("Peter","Flex",true,49,21,69,'e')

    myarr[0]="John"
    println("My name is ${myarr[0]}")
    var myintarr= arrayOf<Int>(12,56,0,69)
    println(myintarr.sorted())

    var mystrarrr= arrayOf<String>("Flex","sirvage")

    var myfloatarr=arrayOf<Float>(21.21f,69.69f)
}