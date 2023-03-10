import java.util.ArrayList;

public class PokemonTeam {
    Pokemon[] pokemons;

    public PokemonTeam(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public ArrayList<Pokemon> getByType(String type) {
        ArrayList<Pokemon> pokemons_by_type = new ArrayList<Pokemon>();
        for(Pokemon p : this.pokemons) {
            if(p.getType() == type) pokemons_by_type.add(p); 
        }
        return pokemons_by_type;
    }

    public float calulateLevelAverage() {
        int level_sum = 0;
        for(Pokemon p : this.pokemons) {
            level_sum += p.getLevel();
        }
        return level_sum/this.pokemons.length;
    }

    public Pokemon getMaxLifePokemon() {
        int maxlife_pokemon_index = 0;
        int current_max_life = 0;
        for(int i = 0; i < this.pokemons.length; ++i) {
            if (pokemons[i].getMaxLife() > current_max_life) {
                current_max_life = pokemons[i].getMaxLife();
                maxlife_pokemon_index = i;
            }
        }
        return this.pokemons[maxlife_pokemon_index];
    }
}
