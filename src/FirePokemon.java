import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks;
    public FirePokemon(String name, int level, int hp, String food, String sound) {

        super(name,level,hp,food,sound, "fire");
        this.attacks = Arrays.asList("inferno","pyroBall","fireLash", "flameThrower");
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }
    @Override
    public void superAttack(Pokemon name, Pokemon enemy, int hpDifference) {
    }
    void inferno(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno.");
        switch (typeEnemy) {
            case "grass" -> {
                hpDifference = 55;
                super.hpMin(enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 50;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void pyroBall(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball.");
        switch (typeEnemy) {
            case "grass" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
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
    void fireLash(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " firelash.");
        switch (typeEnemy) {
            case "grass" -> {
                hpDifference = 45;
                super.hpMin(enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 35;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void flameThrower(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower.");
        switch (typeEnemy) {
            case "grass" -> {
                hpDifference = 60;
                super.hpMin(enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 50;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
}

