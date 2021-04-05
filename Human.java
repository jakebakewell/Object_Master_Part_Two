public class Human {
    int health = 100;
    int strength = 3;
    int intelligence = 3;
    int stealth = 3;
    public Human() {
    }
    public void displayHealth() {
        System.out.println("HP: " + health);
    }
    public void attackHuman(Human target) {
        System.out.println("Attacking");
        target.health -= this.strength;
    }
}
