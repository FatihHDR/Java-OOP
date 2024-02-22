public class Main {
    public static void main(String[] args) {
        Zombie zumbi = new Zombie();
        Pocong hantuPocong = new Pocong();
        Burung burung = new Burung();

        zumbi.attack();
        zumbi.walk();

        hantuPocong.attack();
        hantuPocong.jump();

        burung.attack();
        burung.walk();
        burung.fly();
    }
}