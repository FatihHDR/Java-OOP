public class Zombie extends Enemy {
    public Zombie() {
        super("Zombie", 100, 20);
    }

    void walk() {
        System.out.println("Zombie jalan-jalan");
    }
}