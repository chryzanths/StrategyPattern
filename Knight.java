public class Knight implements CharacterType{
    @Override
    public String attack(){
        String output = new String();
        output += "Knight attacks with a sword!\n";
        return output;
    }
    @Override
    public String defend()
    {
        String output = new String();
        output += "Knight using a shield to defend!\n";
        output += "Knight dodgin to avoid attack!\n";
        output += "Knight creating a magic barrier for defense!";
        return output;
    }
}