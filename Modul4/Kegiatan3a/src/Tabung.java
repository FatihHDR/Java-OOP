public class Tabung extends Lingkaran {
    private int tinggi;

    public Tabung(int jariJari, int tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double luas() {
        return super.luas() + (2 * Math.PI * jariJari * tinggi);
    }

    public double getVolume() {
        return hitungVolume();
    }
}