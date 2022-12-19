fun main(){
    for(n in 1..10){
        println("Sebelum berak, nilai : $n")
        if ( n == 5){
            println("Proses Loop berhenti karena break ")
            break
        }
    }

    for (ch in 'A' .. 'C'){
        for (n in 1..4){
            println("$ch and $n")
            if ( n == 2)
                break
        }
    }

    println()
    contohLoop@ for (nilai in 1..10){
        if (nilai == 5) {
            println("Nilai ini berada pada block IF " +nilai+ "\n-- Jadi program akan berhenti")
            break
        } else {
            println("Nilai ini berada pada block Else " + nilai)
            continue@contohLoop
        }
    }
}