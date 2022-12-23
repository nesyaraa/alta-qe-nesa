public class segitiga {
    int alas;
    int tinggi;
    private int sisimiring;{
        double sisimiring =Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
    }

    public segitiga(int alas, int tinggi, int sisi) {
        this.alas=alas;
        this.tinggi=tinggi;
    }

    public int luassegitiga() {
        return this.alas * this.tinggi/2;
    }
    public int kelilingsegitiga(){
        return this.alas+this.tinggi+this.sisimiring;
    }
}


