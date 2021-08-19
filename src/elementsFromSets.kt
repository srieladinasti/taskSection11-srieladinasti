fun main() {
    var bilGanjil = setOf(1, 3, 5, 5, 7, 9)
    println(bilGanjil)
    if (bilGanjil.contains(5)){
        println("Tersedia")
    }
    else{
        println("Tidak tersedia")
    }

    println()

    var bilGenap = setOf(2, 4, 6, 4, 8, 10)
    println(bilGenap)
    if (2 in bilGenap){
        println("Tersedia")
    }
    else{
        println("Tidak tersedia")
    }
}