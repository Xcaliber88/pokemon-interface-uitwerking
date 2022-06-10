import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final static String TYPE = "fire";

    List<String> attacks = Arrays.asList("fireLash", "inferno", "pyroBall", "flameThrower");
    List<String> getAttacks() {
        return attacks;
    }

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound,TYPE);
    }

    public static String getTYPE() {
        return TYPE;
    }



    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with inferno!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp= enemy.getHp()-30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "grass":
                temp= enemy.getHp()-40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "fire":
                temp= enemy.getHp()-10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "electric":
                temp= enemy.getHp()-20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new Hp is: "+ enemy.getHp());
    }
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with pyroball!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp= enemy.getHp()-30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "grass":
                temp= enemy.getHp()-40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "fire":
                temp= enemy.getHp()-10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "electric":
                temp= enemy.getHp()-20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new Hp is: "+ enemy.getHp());
    }
    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with firelash!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp= enemy.getHp()-30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "grass":
                temp= enemy.getHp()-40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "fire":
                temp= enemy.getHp()-10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "electric":
                temp= enemy.getHp()-20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new Hp is: "+ enemy.getHp());
    }
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with flamethrower!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp= enemy.getHp()-30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "grass":
                temp= enemy.getHp()-40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
            case "fire":
                temp= enemy.getHp()-10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "electric":
                temp= enemy.getHp()-20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new Hp is: "+ enemy.getHp());
    }

}
