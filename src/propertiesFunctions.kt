fun main() {
    var anggotaKeluarga = mapOf('A' to "Ayah", 'I' to "Ibu", 'K' to "Kakak", 'B' to "Abang")
    println(anggotaKeluarga)
    print(anggotaKeluarga.get('B'))
    if(anggotaKeluarga.isEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(anggotaKeluarga.size)

    println()

    var namaAnggota = mapOf('A' to "Edi", 'I' to "Epi", 'K' to "Ika", 'B' to "Bro")
    println(namaAnggota)
    print(namaAnggota.get('k'))
    if(namaAnggota.isNotEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(namaAnggota.size)

    println()

    var tahunKelahiran = mapOf('A' to 1959, 'I' to 1962, 'K' to 1986, 'B' to 1991)
    println(tahunKelahiran)
    print(tahunKelahiran.get('A'))
    if(tahunKelahiran.isEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(tahunKelahiran.size)

    println()

    var umurAnggota = mapOf('A' to 62, 'I' to 59, 'K' to 34, 'B' to 29)
    println(umurAnggota)
    print(umurAnggota.get('i'))
    if(umurAnggota.isNotEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(umurAnggota.size)

    println()

    var pekerjaanAnggota = mapOf('A' to "Polri", 'I' to "Guru", 'K' to "Ibu Rumah Tangga", 'B' to "Wiraswasta")
    println(pekerjaanAnggota)
    print(pekerjaanAnggota.get('A'))
    if(pekerjaanAnggota.isEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(pekerjaanAnggota.size)

    println()

    var domisiliAnggota = mapOf('A' to "Pangkal Pinang", 'I' to "Bukittinggi", 'K' to "Jakarta", 'B' to "Jakarta")
    println(domisiliAnggota)
    print(domisiliAnggota.get('b'))
    if(domisiliAnggota.isNotEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(domisiliAnggota.size)

    println()

    var noAnggota = mapOf('A' to 1234, 'I' to 5678, 'K' to 9101, 'B' to 1213)
    println(noAnggota)
    print(noAnggota.get('I'))
    if(noAnggota.isEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(noAnggota.size)

    println()

    var statusAnggota = mapOf('A' to "Menikah", 'I' to "Menikah", 'K' to "Menikah", 'B' to "Lajang")
    println(statusAnggota)
    print(statusAnggota.get('k'))
    if(statusAnggota.isNotEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(statusAnggota.size)

    println()

    var hobiAnggota = mapOf('A' to "Badminton", 'I' to "Masak", 'K' to "Travelling", 'B' to "Main Game")
    println(hobiAnggota)
    print(hobiAnggota.get('E'))
    if(hobiAnggota.isNotEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(hobiAnggota.size)

    println()

    var pendidikanAnggota = mapOf('A' to "SMA", 'I' to "D2", 'K' to "S1", 'B' to "SMA")
    println(pendidikanAnggota)
    print(pendidikanAnggota.get('s'))
    if(pendidikanAnggota.isNotEmpty()){
        println(" - The Map is Empty")
    }
    else{
        println(" - The Map is not Empty")
    }
    println(pendidikanAnggota.size)
}