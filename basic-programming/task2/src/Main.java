public class Main {
    public static void main(String[] args) {

        int studentScore = 35;
        String hasil = "";

        if (studentScore>=80 && studentScore<=100){
            hasil = "A";
        }
        else if (studentScore>=65 && studentScore<=79){
            hasil ="B+";
        }
        else if (studentScore>=50 && studentScore<=64){
            hasil = "B";
        }
        else if (studentScore>=35 && studentScore<=49){
            hasil = "C";
        }
        else if (studentScore>=0 && studentScore<=34){
            hasil = "D";
        }
        else if (studentScore<=0 && studentScore>=100){
            hasil = "invalid";
        }


        System.out.println(hasil);
    }
}