public class Main {
    int nilai;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        segitiga segitiga = new segitiga(3, 4, 5);
        System.out.println("luas segitiga " + segitiga.luassegitiga());
        System.out.println("keliling segitiga " +segitiga.kelilingsegitiga());

        persegi persegi=new persegi(4,4);
        System.out.println("luas persegi " + persegi.luaspersegi());
        System.out.println("keliling persegi " + persegi.kelilingpersegi());

        persegipanjang persegipanjang=new persegipanjang(7,8);
        System.out.println("luas persegipanjang " + persegipanjang.luaspersegipanjang());
        System.out.println("keliling persegi panjang " + persegipanjang.kelilingpersegipanjang());
    }
}