package MonsterGame;

/**
 * Created by brandonsmith on 7/9/14.
 */
public class Orc implements Monster {
    private String name;
    private int hp;

    public Orc() {
        name = "Orc";
        hp = 20;
    }

    public String name() {
        return name;
    }

    public int getHitpoints() {
        return hp;
    }

    public int takeDamage(int damage) {
        return hp -= damage;
    }
}
