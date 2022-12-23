public class persegipanjang {

    int panjang;
    int lebar;

    public persegipanjang (int panjang, int lebar) {
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public int luaspersegipanjang() {
        return this.panjang*this.lebar;
    }

    public int kelilingpersegipanjang() {
        return (this.panjang*2)+(this.lebar*2);
    }
}


