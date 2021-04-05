public class MasterTest {
    public static void main(String[] args) {
        Wizard gandalf = new Wizard();
        Ninja naruto = new Ninja();
        Samurai masayoshi = new Samurai();
        naruto.steal(gandalf);
        gandalf.displayHealth();
        naruto.steal(masayoshi);
        masayoshi.displayHealth();
        gandalf.fireball(masayoshi);
        masayoshi.displayHealth();
        gandalf.heal(masayoshi);
        masayoshi.displayHealth();
        naruto.runAway();
        naruto.displayHealth();
        masayoshi.deathBlow(gandalf);
        masayoshi.displayHealth();
        masayoshi.meditate();
        masayoshi.displayHealth();
        masayoshi.howMany();
    }
}
