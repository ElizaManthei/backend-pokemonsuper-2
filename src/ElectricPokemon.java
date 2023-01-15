import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks;
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {

        super(name,level,hp,food,sound,"electric");

        this.attacks = Arrays.asList("thunderPunch","electroBall","thunder", "voltTackle");
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }
    @Override
    public void superAttack(Pokemon name, Pokemon enemy, int hpDifference) {
        int oldHp = enemy.getHp();
        enemy.setHp(oldHp + hpDifference);
        System.out.println(enemy.getName() + " gets a hp boost. " + hpDifference + " points!" );
    }
    void thunderPunch(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch.");
        switch (typeEnemy) {
            case "water" -> {
                hpDifference = 50;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 45;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void electroBall(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroball.");
        switch (typeEnemy) {
            case "water" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 1;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void thunder(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder.");
        switch (typeEnemy) {
            case "water" -> {
                hpDifference = 35;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 25;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 20;
                superAttack(name, enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void voltTackle(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volttackle.");
        switch (typeEnemy) {
            case "water" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 15;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 5;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
}
