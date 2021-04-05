public class Samurai extends Human {
    int numOfSamurai = 0;
    public Samurai() {
        numOfSamurai += 1;
        this.health = 200;
    }
    public void deathBlow(Human target) {
        target.health = 0;
        this.health = this.health/2;
    }
    public void meditate() {
        this.health = 200;
    }
    public int howMany() {
        System.out.println(numOfSamurai);
        return numOfSamurai;
    }
}
