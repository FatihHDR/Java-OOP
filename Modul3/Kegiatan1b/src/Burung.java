public class Burung extends Enemy {
    public Burung() {
        super("Burung", 30, 10);
    }

    void walk() {
        System.out.println("Burung berjalan");
    }

    void fly() {
        System.out.println("Burung terbang");
    }
}