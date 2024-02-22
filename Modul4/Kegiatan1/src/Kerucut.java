public class Kerucut extends BangunRuang {
    private double jariJari, tinggi, sumbu;

    public Kerucut(double jariJari, double tinggi, double sumbu) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.sumbu = sumbu;
    }

    @Override
    public double getLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public double getVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}