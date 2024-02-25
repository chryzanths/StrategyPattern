public class Archer implements AttackStrategy, DefenseStrategy{
    @Override
    public String castSpell() {
        String output = new String();
        output += "NO ABILITY\n";
        return output;
    }

    @Override
    public String shootArrow() {
        String output = new String();
        output += "Archer shoots an arrow!\n";
        return output;
    }

    @Override
    public String swingSword() {
        String output = new String();
        output += "NO ABILITY\n";
        return output;
    }

    @Override
    public String shield() {
        String output = new String();
        output += "Archer using a shield to defend!\n";
        return output;
    }

    @Override
    public String dodge() {
        String output = new String();
        output += "NO ABILITY\n";
        return output;
    }

    @Override
    public String createMagic() {
        String output = new String();
        output += "NO ABILITY\n";
        return output;
    }

}