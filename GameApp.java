public class GameApp{
    public static void main(String[] args){
        Character character = new Character("Knight", new Knight());

        System.out.println(character.attack());
        System.out.println(character.defend());
    }
}