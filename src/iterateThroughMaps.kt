fun main() {
    var anggotaKeluarga = mutableMapOf('A' to "Ayah", 'I' to "Ibu", 'K' to "Kakak", 'B' to "Abang")
    println(anggotaKeluarga)
    for ((inisial, keterangan1) in anggotaKeluarga){
        println("$inisial - $keterangan1")
    }

    println()

    var namaAnggota = mutableMapOf('A' to "Edi", 'I' to "Epi", 'K' to "Ika", 'B' to "Bro")
    println(namaAnggota)
    for ((inisial, keterangan2) in namaAnggota){
        println("$inisial - $keterangan2")
    }

    println()

    var tahunKelahiran = mutableMapOf('A' to 1959, 'I' to 1962, 'K' to 1986, 'B' to 1991)
    println(tahunKelahiran)
    for ((inisial, keterangan3) in tahunKelahiran){
        println("$inisial - $keterangan3")
    }

    println()

    var umurAnggota = mutableMapOf('A' to 62, 'I' to 59, 'K' to 34, 'B' to 29)
    println(umurAnggota)
    for ((inisial, keterangan4) in umurAnggota){
        println("$inisial - $keterangan4")
    }

    println()

    var pekerjaanAnggota = mutableMapOf('A' to "Polri", 'I' to "Guru", 'K' to "Ibu Rumah Tangga", 'B' to "Wiraswasta")
    println(pekerjaanAnggota)
    for ((inisial, keterangan5) in pekerjaanAnggota){
        println("$inisial - $keterangan5")
    }
}