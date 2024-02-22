public class Enemy {
    String name;
    int hp;
    int attackPoin;

    public Enemy(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
    }

    void attack() {
        System.out.println(name + " serang!");
    }
}