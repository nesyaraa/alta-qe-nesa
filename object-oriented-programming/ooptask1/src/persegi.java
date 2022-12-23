public class persegi {
    int sisi1;
    int sisi2;

    public persegi(int sisi1, int sisi2) {
        this.sisi1=sisi1;
        this.sisi2=sisi2;
    }

    public int luaspersegi() {
        return this.sisi1 * this.sisi2;
    }

    public int kelilingpersegi() {
        return this.sisi1*4;
    }
}

