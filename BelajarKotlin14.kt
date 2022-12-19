package com.example.vivianay_3sid_pertemuan01_wpm

fun main(){
    println("Contohfungsi rekursive 1")
    fungsiRekursive1()

    println("\nContoh fungsi rekursive 2 ")
    print("Masukkan angka faktorial : ")
    val angka = Integer.valueOf(readLine())
    val hasil = faktorial(angka)
    println("Nilai Faktorial dari $angka = $hasil")
}

var hitung = 5
fun fungsiRekursive1(){
    hitung--;
    if(hitung >= 0){
        println("Halo halo..." +hitung);
        fungsiRekursive1()
    }
}

fun faktorial(n:Int): Long{
    return if(n == 1)
        n.toLong()
    else n * faktorial(n-1)
}