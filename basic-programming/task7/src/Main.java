public class Main {
    private static float Mean(float[] numbers){
        float total=0; //deklarasi variable untuk menampung hitungan
        int i=0; //deklarasi var i

        for(i=0;i<numbers.length;i++){ //number.length aldh pemanggilan array pada numbers
            total=total+numbers[i]; //itung jumlah total
        }
        return total/numbers.length; //tinggal dibagi deh
    }
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value)); //panggilfunction diatas
    }
}