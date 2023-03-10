import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int level;
    private int current_life;
    private int max_life;
    private String type;
    private ArrayList<Attack> attacks;
    private String status;
    private int attack;
    private int defense;
    private int special_attack;
    private int special_defense;
    private int speed;


    public Pokemon(String name, int level, int current_life, int max_life, String type,  ArrayList<Attack> attacks, String status, int attack, int defense, int special_attack, int special_defense, int speed) {
        this.name = name;
        this.level = level;
        this.current_life = current_life;
        this.max_life = max_life;
        this.type = type;
        this.attacks = attacks;
    }

    public void attack(int attack) {
        if(attack >= 0 && attack < 4) {
            System.out.println(this.name+" utilizó "+this.attacks[attack]);
        }
    }

    public void heal(int heal) {
        int points_to_heal = this.max_life - this.current_life;
        if(points_to_heal > heal) {
            System.out.println(this.name+" restored "+heal+" life points!");
            this.current_life += heal;
        }
        else {
            System.out.println(this.name+" restored "+points_to_heal+" life points!");
            this.current_life = this.max_life;
        }
    }
    

    public void flee() {
        double random = Math.random();
        if(random > 0.25) System.out.println(this.name+" huyó!");
        else System.out.println(this.name+" no pudo huir!");
    }

    public String getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMaxLife()  {
        return this.max_life;
    }

    public String getName() {
        return this.name;
    }

    public void setAttack(int attack) {
        this.attack += attack;
    }

    public void setDefense(int defense) {
        this.defense += defense;
    }

    public void setSpecialAttack(int special_attack) {
        this.special_attack +=  special_attack;
    }

    public void setSpecialDefense(int special_defense) {
        this.special_defense += special_defense;
    }

    public void setSpeed(int speed) {
        this.speed += speed;
    }

    public void setStatus(String status) {
        this.status = status;
    } 
 }
