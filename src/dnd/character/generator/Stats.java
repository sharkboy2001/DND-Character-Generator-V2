/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dnd.character.generator;
import java.util.*;

public class Stats {
    Random rnum = new Random();
    private int Roll1;
    private int Roll2;
    private int Roll3;
    private int Roll4;
    void CharacterStats(){
        Roll1 = rnum.nextInt(6) + 1;
        Roll2 = rnum.nextInt(6) + 1;
        Roll3 = rnum.nextInt(6) + 1;
        Roll4 = rnum.nextInt(6) + 1;
        int Rolls [] = {Roll1, Roll2, Roll3, Roll4};
        Arrays.sort(Rolls);
        int total = Rolls[1] + Rolls[2] + Rolls[3];
        System.out.println(total);
    }
}
