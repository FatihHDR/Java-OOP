public abstract class Hero {
    private double healthPoint, attackDamage, defense;
    private boolean lifeStatus = true;

    abstract void spawnIntro();

    void attack(Hero target) {
        reviewDamage(target.getAttackDamage());
    }

    void reviewDamage(double damage) {
        this.healthPoint = healthPoint - (damage - defense);
        if (healthPoint < 0) {
            this.lifeStatus = false;
            this.healthPoint = 0;
        }
    }

    void checkStatus(int i) {
        System.out.println("Player " + i + " HP remaining : " + healthPoint);
    }

    void setStat(double healthPoint, double attackDamage, double defense, double bonusDamage) {
        this.healthPoint = healthPoint;
        this.attackDamage = attackDamage;
        this.attackDamage += attackDamage * bonusDamage;
        this.defense = defense;
    }

    public void printStat(int level) {
        System.out.println("ASSASSIN\nLevel : " + level);
        System.out.println("Attack Damage\t: " + getAttackDamage() + "\t Life Status\t: " + getLifeStatus());
        System.out.println("Health Point\t: " + getHealthPoint() + "\t Defense\t: " + getDefense());
    }

    double getHealthPoint() {
        return healthPoint;
    }

    double getAttackDamage() {
        return attackDamage;
    }

    double getDefense() {
        return defense;
    }

    boolean getLifeStatus() {
        return lifeStatus;
    }
}