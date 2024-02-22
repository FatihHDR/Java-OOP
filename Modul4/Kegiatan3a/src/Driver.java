public class Driver {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(5);
        System.out.println("Lingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        BangunDatar persegi = new Persegi(4);
        System.out.println("Persegi:");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());

        Tabung tabung = new Tabung(3, 5);
        System.out.println("Tabung:");
        System.out.println("Luas: " + tabung.luas());
        System.out.println("Volume: " + tabung.getVolume());

        Limas limas = new Limas(4, 5);
        System.out.println("Limas:");
        System.out.println("Luas: " + limas.luas());
        System.out.println("Volume: " + limas.getVolume());
    }
}
