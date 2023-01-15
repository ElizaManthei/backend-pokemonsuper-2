import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private final List<String> attacks;
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name,level,hp,food,sound,"water");
        this.attacks = Arrays.asList("surf","hydroPump","hydroCanon", "rainDance");
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }
    @Override
    public void superAttack(Pokemon name, Pokemon enemy, int hpDifference) {
        if(enemy.getType().equals("electric")) {
            System.out.println("Raindance has no effect on " + enemy.getName());
        } else {
            int oldHp = enemy.getHp();
            enemy.setHp(oldHp + hpDifference);
            System.out.println(enemy.getName() + " get boost!");
        }
    }
    void surf(Pokemon name, Pokemon enemy) {
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf.");
        switch (typeEnemy) {
            case "fire" -> {
                hpDifference = 50;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void hydroPump(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump.");
        switch (typeEnemy) {

            case "fire" -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 30;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void hydroCanon(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon.");
        switch (typeEnemy) {

            case "fire" -> {
                hpDifference = 25;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 20;
                super.hpMin(enemy, hpDifference);
            }
            case "grass" -> {
                hpDifference = 15;
                super.hpMin(enemy, hpDifference);
            }
            default -> {
                hpDifference = 10;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
    void rainDance(Pokemon name, Pokemon enemy){
        String typeEnemy = enemy.getType();
        int hpDifference;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance.");
        switch (typeEnemy) {

            case "fire" -> {
                hpDifference = 55;
                super.hpMin(enemy, hpDifference);
            }
            case "electric" -> {
                hpDifference = 50;
                superAttack(name, enemy, hpDifference);
            }
            case "grass" -> {
                int boost = 45;
                superAttack(name, enemy, boost);
            }
            default -> {
                hpDifference = 40;
                super.hpMin(enemy, hpDifference);
            }
        }
        super.hpRest(enemy);
    }
}
