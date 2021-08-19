fun main() {
    var volumeBalok = mutableMapOf("Panjang Balok" to 15)
    volumeBalok.put("Lebar Balok", 3)
    println(volumeBalok["Lebar Balok"])
    volumeBalok.put("Tinggi Balok", 5)
    println(volumeBalok["Tinggi Balok"])

    println()

    var luasPP = mutableMapOf("Panjang Persegi Panjang" to 5)
    luasPP["Lebar Persegi Panjang"] = 3
    println(luasPP.get("Lebar Persegi Panjang"))

    println()

    var volumeTabung = mutableMapOf("Jari Tabung" to 14)
    volumeTabung.put("Tinggi Tabung", 18)
    println(volumeTabung["Tinggi Tabung"])

    println()

    var luasSegitiga = mutableMapOf("Alas Segitiga" to 12)
    luasSegitiga["Tinggi Segitiga"] = 3
    println(luasSegitiga.get("Tinggi Segitiga"))

    println()

    var luasJG = mutableMapOf("Alas Jajar Genjang" to 5)
    luasJG.put("Tinggi Jajar Genjang", 3)
    println(luasJG["Tinggi Jajar Genjang"])
}