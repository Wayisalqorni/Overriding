package clone;

public class HeroFighter extends Hero {

    String type = "Strength";

    // subclass constructor
    HeroFighter(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " reeive half damage " + damage + "->" + 0.5 * damage);
        this.health = this.health - 0.5 * damage;
    }
}
