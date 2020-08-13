import java.util.*

fun main(){
    val reader = Scanner (System.`in`)
    print("Masukan nilai : ")
    val nilaiInput : Int = reader.nextInt()
    val result = if (nilaiInput > 90){
        'A'
    } else if (nilaiInput > 80 && nilaiInput <=90){
        'B'
    }else if (nilaiInput > 70 && nilaiInput <= 80){
        'C'
    }else if (nilaiInput > 60 && nilaiInput <=70){
        'D'
    }else if (nilaiInput >= 50 && nilaiInput <=60){
        'E'
    }else {
        'F'
    }
    print("Selamat ya! kamu mendapatkan grade $result")

}