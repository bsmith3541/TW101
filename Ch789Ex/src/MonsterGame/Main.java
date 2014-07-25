package MonsterGame;
import java.util.*;
/**
 * Created by brandonsmith on 7/9/14.
 */

/**
 * Chapter 7, 8, 9:
 * Create Orc and Troll classes that implement a Monster interface
 * takeDamage(int amount), String name(), and int currentHitpoints() methods.
 * Store instances of both classes and store them in an ArrayList.
 * Iterate through the list and make each monster take 10 points of damage.
 * After you have damaged all of the monsters, report the name and current hit points of all monsters.
 * Orcs are named “Orc” and have 20 initial hitpoints
 * Trolls are named “Troll”, have 40 hit points and only take half damage
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList();
        Orc orc = new Orc();
        Troll troll = new Troll();
        monsters.add(orc);
        monsters.add(troll);

        for (Monster monster : monsters) {
            monster.takeDamage(10);
        }
        for (Monster monster : monsters) {
            System.out.println(monster.name());
            System.out.println(monster.getHitpoints());
        }
    }

}
