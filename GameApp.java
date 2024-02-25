public class GameApp{
    public static void main(String[] args){
        Character character = new Character("Knight", new Knight(), new Knight());

        System.out.println(character.swingSword());
        System.out.println(character.dodge());
    }
}