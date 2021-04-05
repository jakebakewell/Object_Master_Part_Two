public class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }
    public void steal(Human target) {
        target.health -= stealth;
        this.health += stealth;
    }
    public void runAway() {
        System.out.println("The ninja flees away into the darkness");
        this.health -= 10;
    }
}
