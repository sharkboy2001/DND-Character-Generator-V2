/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dnd.character.generator;
import java.util.*;

public class CharacterInfo {
    private final String [] CLASSES = {"Artificer", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
    private final String [] RACE = {"Dwarf", "Tiefling", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Aasimir", "Firbolg", "Goliath", "Kenku", "Lizardfolk", "Tabaxi", "Triton"};
    private final String [] ALIGNMENT = {"Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "True neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil"};
    private final String [] BACKGROUND = {"Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin"};
    Random rnum = new Random();
    int a = rnum.nextInt(CLASSES.length);
    int b = rnum.nextInt(RACE.length);
    int c = rnum.nextInt(ALIGNMENT.length);
    int d = rnum.nextInt(BACKGROUND.length);
    void GenerateCharacter() {
    System.out.println("You are a " + RACE[b] + " " + CLASSES[a] + ". Your alignment is " + ALIGNMENT[c] + " and your background is " + BACKGROUND[d]);
}
}
