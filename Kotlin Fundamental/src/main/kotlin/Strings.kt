fun main (){
    var WordOne = " Modern "
    var WordTwo = " Concise "
    var WordThree = " Pragmatic "
    var WordFour = " Safe "
    val text = """
        Kotlin is $WordOne
        Kotlin is $WordTwo
        Kotlin is $WordThree
        Kotlin is $WordFour
        """.trimIndent()
    print(text)
}