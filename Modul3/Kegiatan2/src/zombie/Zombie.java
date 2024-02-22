package zombie;

import enemy.Enemy;

public class Zombie extends Enemy {
    public Zombie() {
        super("Zombie", 100, 20);
    }

    public void walk() {
        System.out.println("Zombie jalan-jalan");
    }
}