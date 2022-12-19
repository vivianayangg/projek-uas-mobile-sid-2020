package com.example.vivianay_3sid_pertemuan01_wpm

import java.lang.ArithmeticException

fun main(){
    println("Coba Exception Handling 1 ")
    try{
        val testError = 10/0
        println("Contoh Error")
        println(testError)
    } catch (e : ArithmeticException){
        println("Arithmetic Exception")
    } catch (e:Exception){
        println(e)
    } finally {
        println( "Pada block finally, apapun itu yang terjadi ya tetap di print ")
    }

    println("\n Coba Exception Handling 2")
    contohError()
}

fun contohError(){
    try{
        println("Sebelum Exception")
        throw java.lang.Exception("Hayooo masalahnya masuk ke Throw")
        println("Sesudah Exception")
    } catch (e:Exception){
        println(e)
    } finally {
        println("Masih error, tapi finally tetap muncul ya")
    }
}