public class Wizard implements AttackStrategy, DefenseStrategy{
    @Override
    public String castSpell() {
        String output = new String();
        output += "Wizard casts a spell!\n";
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
        output += "NO ABILITY\n";
        return output;
    }

    @Override
    public String shield() {
        String output = new String();
        output += "NO ABILITY\n";
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
        output += "Wizard creating a magic barrier for defense!\n";
        return output;
    }

}