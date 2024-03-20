fun main(args: Array<String>) {
    var mychar= 'a'
    when(mychar){
        'a'-> println("a is a vowel")
        'e'-> println("e is a vowel")
        'i'-> println("i is a vowel")
        'o'-> println("o is a vowel")
        'u'-> println("u is a vowel")

        else -> println("$mychar is a consonant")
    }
}