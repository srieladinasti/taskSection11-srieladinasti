fun main() {
    var volumeBalok = mutableMapOf("Panjang Balok" to 15)
    println(volumeBalok)
    volumeBalok.put("Lebar Balok", 3)
    println(volumeBalok["Lebar Balok"])
    volumeBalok.put("Tinggi Balok", 5)
    println(volumeBalok["Tinggi Balok"])
    println(volumeBalok)
    volumeBalok.remove("Panjang Balok")
    println(volumeBalok)

    println()

    var luasPP = mutableMapOf("Panjang Persegi Panjang" to 5)
    println(luasPP)
    luasPP["Lebar Persegi Panjang"] = 3
    println(luasPP.get("Lebar Persegi Panjang"))
    println(luasPP)
    luasPP.remove("Panjang Persegi Panjang")
    println(luasPP)

    println()

    var volumeTabung = mutableMapOf("Jari Tabung" to 14)
    println(volumeBalok)
    volumeTabung.put("Tinggi Tabung", 18)
    println(volumeTabung["Tinggi Tabung"])
    println(volumeTabung)
    volumeTabung.remove("Jari Tabung")
    println(volumeTabung)

    println()

    var luasSegitiga = mutableMapOf("Alas Segitiga" to 12)
    println(luasSegitiga)
    luasSegitiga["Tinggi Segitiga"] = 3
    println(luasSegitiga.get("Tinggi Segitiga"))
    println(luasSegitiga)
    luasSegitiga.remove("Tinggi Segitiga")
    println(luasSegitiga)

    println()

    var luasJG = mutableMapOf("Alas Jajar Genjang" to 5)
    println(luasJG)
    luasJG.put("Tinggi Jajar Genjang", 3)
    println(luasJG["Tinggi Jajar Genjang"])
    println(luasJG)
    luasJG.remove("Tinggi Jajar Genjang")
    println(luasJG)
}