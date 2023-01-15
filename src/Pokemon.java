import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {
    private final String name;
    private final int level;
    private final String type;
    private int hp;
    private final String food;
    private final String sound;


    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }


    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public abstract List<String> getAttacks();

    public abstract void superAttack(Pokemon name, Pokemon enemy, int hpDifference);


    protected void hpMin(Pokemon pokemon, int hpDifference) {

        int enemyHp = pokemon.getHp();

        System.out.println(pokemon.getName() + " loses " + Main.ANSI_RED + hpDifference + Main.ANSI_RESET + " hp.");
        if (enemyHp - hpDifference <= 0) {
            pokemon.setHp(0);
        } else {
            pokemon.setHp(enemyHp - hpDifference);
        }
    }

    protected void hpRest(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " hp left.");
    }

}


