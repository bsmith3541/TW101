package MonsterGame;

/**
 * Created by brandonsmith on 7/9/14.
 */
public class Troll implements Monster {
    private String name;
    private int hp;

    public Troll() {
        name = "Troll";
        hp = 40;
    }

    public String name() {
        return name;
    }

    public int getHitpoints() {
        return hp;
    }

    public int takeDamage(int damage) {
        return hp -= damage * 0.5;
    }
}
