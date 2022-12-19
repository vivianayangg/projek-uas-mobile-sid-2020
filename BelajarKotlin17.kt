package com.example.vivianay_3sid_pertemuan01_wpm

fun main(){
    println("Contoh High Order 1")
    contohFungsi(3, :: contohFungsi2)

    println("\nContoh High Order 2")
    val jumlah = contohFungsi3(25)
    println("Hasil penjumlahan 25 + 30 = ${jumlah(30)} ")
}

fun contohFungsi(kls:Int, fungsi: (Int) -> Unit){
    print("Selamat kalian sudah berhasil naik ke kelas")
    fungsi(kls)
}

fun contohFungsi2(kls: Int){
    print(kls)
}

fun contohFungsi3(nilai1:Int): (Int) -> Int = {
    nilai2 -> nilai2 + nilai1
}