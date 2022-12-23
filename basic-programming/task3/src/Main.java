import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //deklarasi

        int bilangan;
        int i;

        //proses
        Scanner input = new Scanner(System.in);
        bilangan = input.nextInt();
        for (i=1; i<=bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}