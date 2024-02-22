public class Character{
    private String type;
    private CharacterType characterType;

    public Character(String type, CharacterType characterType){
        this.type = type;
        this.characterType = characterType;
    }

    public String attack(){
        return "Your character type is: " + type + "\nAttacks: " + characterType.attack();
    }

    
    public String defend(){
        return "Your character type is: " + type + "\nDefense: " + characterType.defend();
    }

}