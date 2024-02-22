public class Archer implements CharacterType{
    @Override
    public String attack(){
        String output = new String();
        output += "Archer shoots an arrow!\n";
        return output;
    }
    @Override
    public String defend()
    {
        String output = new String();
        output += "Archer using a shield to defend!\n";
        return output;
    }
}