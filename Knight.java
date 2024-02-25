public class Knight implements AttackStrategy, DefenseStrategy{


    // ATTACKS
    @Override
    public String castSpell() {
        String output = new String();
        output += "NO ABILITY\n";
        return output;
    }

    @Override
    public String shootArrow() {
        String output = new String();
        output += "NO ABILITY\n";
        return output;
    }

    @Override
    public String swingSword() {
        String output = new String();
        output += "Knight attacks with a sword!\n";
        return output;
    }


    // DEFENSE
    @Override
    public String shield() {
        String output = new String();
        output += "Knight using a shield to defend!\n";
        return output;
    }

    @Override
    public String dodge() {
        String output = new String();
        output += "Knight dodging to avoid attack!\n";
        return output;
    }

    @Override
    public String createMagic() {
        String output = new String();
        output += "Knight creating a magic barrier for defense!";
        return output;
    }

}