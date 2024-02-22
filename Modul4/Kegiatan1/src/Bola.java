public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}
