public class Persegi implements BangunDatar {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double luas() {
        return hitungLuas();
    }

    @Override
    public double keliling() {
        return hitungKeliling();
    }
}