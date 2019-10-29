/*
 * This class represents a HumanPlayer
 * And will get input from keyboard
 */
package nimgame;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *  Gets input from User to play.
 * @author Richard'PC
 */
public class Human implements Player {

    private String name;

    // setting the name
    public Human(String name){
        this.name = name;
    }
    
    /**
     * Returns the amount of marbles removed from the pile by Human using JOPtionPanel,
     * if -1 is returned means the Player will cancel the game.
     * 
     * @param total Current amount on pile
     * @return The amount to take away.
     */
    public int move(int total){
        
        String displayText = name+" turn"+"\nCurrent # marbles: " + total +"\nInsert amount you which to take:" ;
        boolean notInteger = true;
        //Will keep asking until an integer has been written
        while(notInteger){
        //Getting input
        String amount = JOptionPane.showInputDialog(displayText);
        if(amount != null){
            //Using scanner to get the int from the input
            Scanner scan = new Scanner(amount);
            if(scan.hasNextInt()){
                int numMarbles = scan.nextInt();
                if(numMarbles > 0 && numMarbles <= total/2){
                    notInteger = false;
                    return numMarbles;
                }
            }
        }else{
        return -1;
        }
       }
        return -1;
    }
    
    /**
     * Set different name
     * @param name New name
     */
    public void  setName(String name){
        this.name = name;
    }
    
    /**
     * Returns the Player name.
     * @return String Name
     */
    public String getName(){
        return name;
    }
    
    
    
}
