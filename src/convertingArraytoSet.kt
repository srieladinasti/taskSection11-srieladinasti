fun main() {
    var bilGanjil = arrayOf(1, 3, 5, 5, 7, 9)
    println(bilGanjil.joinToString())
    var bilGanjil1 = setOf(*bilGanjil)
    println(bilGanjil1)

    println()

    var bilGenap = arrayOf(2, 4, 6, 4, 8, 10)
    println(bilGenap.joinToString())
    var bilGenap2 = setOf(*bilGenap)
    println(bilGenap2)
}