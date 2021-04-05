public class Wizard extends Human {
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }
    public void heal(Human target) {
        target.health += intelligence;
    }
    public void fireball(Human target) {
        target.health -= intelligence * 3;
    }
}
