public class Attack {
    private int power;
    private String type;
    private int current_pp;
    private int max_pp;
    private String name;
    private String effect;
    private float effect_pctg;
    private boolean is_special;
    private float critical_pctg;
    
    public Attack(int power, String type, int current_pp, int max_pp,
    String name, String effect, float effect_pctg, boolean is_special,
    float critical_pctg) {
        this.power = power;
        this.type = type;
        this.max_pp = max_pp;
        this.name = name;
        this.effect = effect;
        this.effect_pctg = effect_pctg;
        this.is_special = is_special;
        this.critical_pctg = critical_pctg;
    }
}
