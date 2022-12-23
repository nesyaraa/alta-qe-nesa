public class Main {
    public static void main(String[] args) {

        operasi operasi = new operasi();


        operasi.angka(3,4); /*panggil konstruktok angka yg ada di kalkulator untuk ngisi nilai xy*/
        System.out.println("penjumlahan = " + operasi.hasiltambah());

        operasi.angka(15,4);/*panggil konstruktok angka yg ada di kalkulator untuk ngisi nilai xy*/
        System.out.println("pengurangan = " + operasi.hasilkurang());

        operasi.angka(10,10);/*panggil konstruktok angka yg ada di kalkulator untuk ngisi nilai xy*/
        System.out.println("perkalian = " + operasi.hasilkali());

        operasi.angka(12,3);/*panggil konstruktok angka yg ada di kalkulator untuk ngisi nilai xy*/
        System.out.println("pembagian = " + operasi.hasilbagi());
    }
}