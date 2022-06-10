import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final static String TYPE = "grass";

    List<String> attacks = Arrays.asList("leafStorm", "leechSeed","leaveBlade", "solarBeam");

    List<String> getAttacks() {
        return attacks;
    }

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound,TYPE);
    }

    public static String getTYPE() {
        return TYPE;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with leafstorm!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "grass":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "fire":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "electric":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());

    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with solarbeam!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "grass":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "fire":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "electric":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with leechseed!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                name.setHp(name.getHp()+20);
                System.out.println(enemy.getName()+ " loses 20Hp" + name.getName() + " gets a boost of 20HP!");
                break;
            case "grass":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                name.setHp(name.getHp()+10);
                System.out.println(enemy.getName()+ " loses 10Hp" + name.getName() + " gets a boost of 10HP!");
                break;
            case "fire":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                name.setHp(name.getHp()+30);
                System.out.println(enemy.getName()+ " loses 30Hp" + name.getName() + " gets a boost of 30HP!");
                break;
            case "electric":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                name.setHp(name.getHp()+40);
                System.out.println(enemy.getName()+ " loses 40Hp" + name.getName() + " gets a boost of 40HP!");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp()+ " and "+ name.getName() + "'s new HP is: "+name.getHp()+"!");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+ " attacks " + enemy.getName() + " with leaveblade!!!");
        int temp=0;
        switch (enemy.getType()){
            case "water":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 20Hp");
                break;
            case "grass":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 10Hp");
                break;
            case "fire":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 30Hp");
                break;
            case "electric":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName()+ " loses 40Hp");
                break;
        }
        System.out.println(enemy.getName()+ "'s new HP is: "+ enemy.getHp());
    }


}
