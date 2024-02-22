public class Assassin extends Hero implements CriticalDamage {
    public Assassin(int level) {
        super.setStat(3000 + (level * 90), 800 + (level * 30), 300 + (level * 15), bonusDamage);
    }

    public void spawnIntro() {
        if (super.getLifeStatus() == true) {
            System.out.println("'Time to kill'");
        } else {
            System.out.println("'Assassin is dead'");
        }

    }
}