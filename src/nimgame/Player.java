/*
 *This interface is helps all players class
 *to move marbles out of the stack.
 */
package nimgame;

/**
 *
 * @author Richard'PC
 */
public interface Player {
    
    /*
    * Move an amount of marbles out of the current 
    * amount.
    */
    int  move(int amountMarbles);
    
    //Setters and Getters
    String getName();
    void setName(String name);
    
    
}
