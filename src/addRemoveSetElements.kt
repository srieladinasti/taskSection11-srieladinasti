fun main() {
    var bilGanjil = mutableSetOf(1, 3, 5, 5, 7, 9)
    println(bilGanjil)
    bilGanjil.add(11)
    println(bilGanjil)
    bilGanjil.remove(1)
    println(bilGanjil)

    println()

    var bilGenap = mutableSetOf(2, 4, 6, 4, 8, 10)
    println(bilGenap)
    bilGenap.add(12)
    println(bilGenap)
    bilGenap.remove(6)
    println(bilGenap)

}