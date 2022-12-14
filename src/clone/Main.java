package clone;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Wayis", 20, 100);
        Hero hero2 = new HeroFighter("Sendy", 50, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}