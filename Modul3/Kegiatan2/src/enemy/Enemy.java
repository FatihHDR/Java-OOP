package enemy;

public class Enemy {
    private String name;
    protected int hp;
    public int attackPoin;

    public Enemy(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
    }

    public void attack() {
        System.out.println(name + " serang!");
    }
}