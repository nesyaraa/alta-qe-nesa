public class price extends dimensi {

    public double Volume() {
        return this.panjang * this.lebar * this.tinggi;
    }
    public double Berat() {
        return Math.ceil(this.Volume() / 50);
    } /*math ceil intuk pembulatan ke atas*/

    public int Harga() {
        return (int) (this.Berat() * 5000);
    }

}
