public class Limas extends Persegi {
    private int tinggi;

    public Limas(int sisi, int tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi / 3;
    }

    @Override
    public double luas() {
        return super.luas() * 2 + (4 * Math.pow(sisi, 2));
    }

    public double getVolume() {
        return hitungVolume();
    }
}