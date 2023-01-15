import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final List<String> attacks;
    public GrassPokemon(String name, int level, int hp, String food, String sound) {

        super(name,level,hp,food,sound, "grass");
        this.attacks = Arrays.asList("leafStorm","solarBeam","leechSeed", "leaveblade");
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }
    @Override
    public void superAttack(Pokemon name, Pokemon enemy, int hpDifference) {
        int pokemonHp = name.getHp();
        name.setHp(pokemonHp + hpDifference);
        System.out.println(name.getName() + " scored " + Main.ANSI_GREEN + hpDifference + Main.ANSI_RESET + " hp!");
    }
    public void leafStorm(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm.");
        switch (typeEnemy) {
            case "electric" -> {
                hpDifference = 50;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm.");
        switch (typeEnemy) {
            case "electric" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 35;
                super.hpMin(enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 25;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 5;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechseed.");
        switch (typeEnemy) {
            case "electric" -> {
                hpDifference = 25;
                super.hpMin(enemy, hpDifference);
                superAttack(name, enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
                superAttack(name, enemy, hpDifference);
            }
            case "water" -> {
                hpDifference = 15;
                super.hpMin(enemy, hpDifference);
                superAttack(name, enemy, hpDifference);
            }
            default -> {
                hpDifference = 5;
                super.hpMin(enemy, hpDifference);
                superAttack(name, enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    public void leaveBlade(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveblade.");
        switch (typeEnemy) {
            case "electric" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            case "fire" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }

            case "water" -> {
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
}

