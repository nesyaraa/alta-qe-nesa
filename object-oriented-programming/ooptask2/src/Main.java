public class Main {
    public static void main(String[] args) {
        int nilai;



        tabung tabung=new tabung(7,10, 3.14);
        System.out.println("volume tabung " + tabung.volumetabung());

        balok balok=new balok(3,6,10);
        System.out.println("volume balok " + balok.volumebalok());


        kubus kubus=new kubus(3,6,10);
        System.out.println("volume kubus" + kubus.volumekubus());



    }
}