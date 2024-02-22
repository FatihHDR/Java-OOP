public class DriverClass {
    public static void main(String[] args) {
        Kerucut kerucut = new Kerucut(5, 10, 15);
        System.out.println("Luas Permukaan Kerucut: " + kerucut.getLuasPermukaan());
        System.out.println("Volume Kerucut: " + kerucut.getVolume());

        Bola bola = new Bola(7);
        System.out.println("Luas Permukaan Bola: " + bola.getLuasPermukaan());
        System.out.println("Volume Bola: " + bola.getVolume());
    }
}