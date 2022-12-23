class Main{

    private static boolean primeNumber(int number)
    {

        int i=2; //karena bilangan prima adalah bilangan asli yang lebih besar dari angka 1
        while (i <= number) // number sebagai pembatas looping
        {
            if(number%i==0 && i!=number) return true;
            i++; //maju terus
        }
        return false;
    }

    public static void main(String [] args){
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(15)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false

    }

}