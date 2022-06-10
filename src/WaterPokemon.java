import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private final static String TYPE = "water";

    List<String> attacks = Arrays.asList("surf", "hydroPump","hydroCanon","rainDance");

    List<String> getAttacks() {
        return attacks;
    }

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound,TYPE);
    }

    public static String getTYPE() {
        return TYPE;
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a surf!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());

    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a hydropump!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a hydrocanon!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a raindance!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "grass":
                temp = enemy.getHp() +20;
                enemy.setHp(temp);
                System.out.println("raindance is boosting " + enemy.getName()+ " with 20hp");
                break;
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "electric":
                System.out.println( "raindance has no effect on: " + enemy.getName());
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());

    }

}
