package MonsterGame;

/**
 * Created by brandonsmith on 7/10/14.
 */
public interface Monster {

    abstract int takeDamage(int amount);
    abstract int getHitpoints();
    abstract String name();

}
