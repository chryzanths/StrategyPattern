public class Character{
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy){
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;

    }

    // ATTACK STRATEGY
    public String castSpell(){
        return "Your character type is: " + type + "\nAttacks: " + attackStrategy.castSpell();
    }
    public String shootArrow(){
        return "Your character type is: " + type + "\nAttacks: " + attackStrategy.shootArrow();

    }
    public String swingSword(){
        return "Your character type is: " + type + "\nAttacks: " + attackStrategy.swingSword();
    }

    // DEFENSE STRATEGY

    public String shield(){
        return "Your character type is: " + type + "\nDefense: " + defenseStrategy.shield();
    }
    public String dodge(){
        return "Your character type is: " + type + "\nDefense: " + defenseStrategy.dodge();
    }
    public String createMagic(){
        return "Your character type is: " + type + "\nDefense: " + defenseStrategy.createMagic();
    }

}