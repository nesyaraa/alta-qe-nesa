public class tabung {
    int r;
    int tinggi;
    double PHI= 3.14;

    public tabung(int r, int tinggi, double PHI) {
        this.r = r;
        this.tinggi = tinggi;
        this.PHI = PHI;
    }


    public double volumetabung() {
        double v = this.PHI * this.r * this.r * this.tinggi;
        return v;

        /*or return this.PHI * this.r * this.r * this.tinggi;
        semuanya bisa dipake, sama aja.
         */

    }
}
