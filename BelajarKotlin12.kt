package com.example.vivianay_3sid_pertemuan01_wpm

fun main(){
    namaKu()
    contohReturn("Budi", 12)
    println("Ini hasil dari function Jumlah : ${jumlah(5, 10, 15, 20)}")
}

fun namaKu(){
    println("Viviana Y")
}

fun contohReturn(nama:String, umur:Int){
    print("Halo, namaku $nama. Umurku $umur tahun")
}

fun jumlah(vararg angka: Int):Int{
    var hasilJumlah = 0
    angka.forEach{ nilai -> hasilJumlah += nilai}

    return hasilJumlah
}
