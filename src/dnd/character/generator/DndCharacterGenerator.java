

package dnd.character.generator;
import java.util.*;

public class DndCharacterGenerator {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CharacterInfo MyCharacter = new CharacterInfo();
        Stats CharacterStats = new Stats();
        System.out.println("Hello! This program generates a random Dungeons and Dragons character.");
        System.out.println("This program uses the classes from Tasha's Cauldron of Everything as well as the player races from the 5e Player's Handbook and Volo's Guide to Monsters. Backgrounds are from the 5e Player's Handbook.");
        System.out.println("This program assumes your character is starting at level 1 and thus does not assign a subclass.");
        MyCharacter.GenerateCharacter();
        for (int i = 0; i <=5; i++){
            CharacterStats.CharacterStats();
        }
    }
    
}
