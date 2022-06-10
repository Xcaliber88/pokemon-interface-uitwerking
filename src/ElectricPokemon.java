import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private final static String TYPE = "electric";

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    List<String> getAttacks() {
        return attacks;
    }

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound,TYPE);
    }

    public static String getTYPE() {
        return TYPE;
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a thunderpunch!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "grass":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "fire":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "electric":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a electroball!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "grass":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "fire":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "electric":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a thunder!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "grass":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "fire":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "electric":
                temp = enemy.getHp() + 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " gets a boost of 10Hp!!!");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " +enemy.getName() + " with a voltTackle!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "grass":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "fire":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "electric":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }
}
