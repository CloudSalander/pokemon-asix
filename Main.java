import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        String[] attacks =  {"Thunder Wave", "Electroshock","Growl","Tailwhip"};
        Pokemon p1 = new Pokemon("Pikachu", 25, 32, 57, "Electric",attacks);
        Pokemon p2 = new Pokemon("Charmander", 25, 32, 59, "Fuego",attacks);
        Pokemon p3 = new Pokemon("Raichu", 25, 32, 63, "Electric",attacks);
        Pokemon p4 = new Pokemon("Digglet", 25, 32, 49, "Earth",attacks);
        Pokemon p5 = new Pokemon("Bellsprout", 25, 32, 50, "Planta",attacks);
        Pokemon p6 = new Pokemon("Dragonite", 25, 32, 45, "Dragon",attacks);
        
        p1.attack(1);
        p1.heal(20);
        p1.flee();
        p1.flee();
        p1.flee();

        Pokemon[] pokemons = {p1,p2,p3,p4,p5,p6};
        PokemonTeam pokemon_team = new PokemonTeam(pokemons);

        System.out.println("Los pokemons de tipo eléctrico son");
        ArrayList<Pokemon> pokemons_electricos = pokemon_team.getByType("Electric");
        for(Pokemon pokemon_electrico : pokemons_electricos) {
            System.out.println(pokemon_electrico.getName());
        }

        System.out.println("El pokemon con más vida máxima es");
        Pokemon max_life_pokemon = pokemon_team.getMaxLifePokemon();
        System.out.println(max_life_pokemon.getName());        

    }
    
}
