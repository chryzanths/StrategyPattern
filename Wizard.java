public class Wizard implements CharacterType{
    @Override
    public String attack(){
        String output = new String();
        output += "Wizard casts a spell!\n";
        return output;
    }
    @Override
    public String defend()
    {
        String output = new String();
        output += "Wizard reating a magic barrier for defense!\n";
        return output;
    }
}