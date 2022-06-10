import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private String name;

    FirePokemon charizard = new FirePokemon("charizard",20,100,"fireFly", "roar");
    WaterPokemon blastoise = new WaterPokemon("blastoise", 30,120, "fish","blub" );
    WaterPokemon gyarados = new WaterPokemon("gyarados", 25, 150, "turtle", "bloob");
    GrassPokemon venusaur = new GrassPokemon("venusaur", 40,200, "grasshopper","zoom");
    GrassPokemon ditto = new GrassPokemon("ditto", 50,200, "wheat", "zzzz");
    ElectricPokemon raichu = new ElectricPokemon("raichu", 45, 160, "electrofly", "bzzz");

    List<Pokemon> pokemons = Arrays.asList(charizard,blastoise,gyarados,venusaur,ditto,raichu);

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
