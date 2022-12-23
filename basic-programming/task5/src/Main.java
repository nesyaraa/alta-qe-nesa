import java.util.Scanner;
public class Main {
    private static boolean palindrome(String value){
        String x=""; // untuk menampung hasil proses
        int i;
        for (i = value.length() - 1; i >= 0; i--) {
            x = x + value.charAt(i);
        }

        return value.equals(x); //eq untuk membandingkan dua String berdasarkan kontennya
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}