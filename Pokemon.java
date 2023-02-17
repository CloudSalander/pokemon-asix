public class Pokemon {
    String[] tipo;
    String clasePokemon;
    int id;
    int generacion;
    String apodo;
    String estado;
    String[] ataques;
    int n_pokedex;
    boolean is_shiny;
    String active_skill;
    String hide_skill;
    String genre;
    int vida;
    int ataque;
    int ataque_especial;
    int defensa;
    int defensa_especial;
    int velocidad;

    public Pokemon() {}

    public void attack() {
        System.out.println("El pokemon ha atacado!");
    }
    public void flee() {
        System.out.println("El pokemon ha huído!");
    }
    
}
