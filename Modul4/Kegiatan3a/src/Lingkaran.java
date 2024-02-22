import java.lang.Math;

public class Lingkaran implements BangunDatar {
    int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
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