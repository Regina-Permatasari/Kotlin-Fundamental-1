fun main(){
    val NilaiDiatasKKM = 80
    val NilaiDibawahKKM = 60
    val nilai : String
    nilai = if (NilaiDibawahKKM > 60) {
        " Selamat Ya !!! "
    } else if (NilaiDibawahKKM < NilaiDiatasKKM){
        " Nilai kamu 80, Selamat Ya !!! "
    } else {
        " Nilai kamu 60, silahkan ikuti remedial "
    }
    print(nilai)
}