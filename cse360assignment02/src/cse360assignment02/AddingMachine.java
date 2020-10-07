package cse360assignment02;
/**
 * Github link to repo: https://github.com/jrmart45/AddingMachine.git
 */
/**
 * 
 * Saga was added to hold the integers passed via the add and sub methods.
 */
public class AddingMachine {
  private int total;
  private String saga = "0"; 
  
/**
 * Saga is used to store each value passed into the methods
 */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    saga = "0";
  }
  /**
   * 
   * This method will return the current total held in total variable.
   * @return the current value stored in total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * This method will add the passed in value to the total variable.
 * @param value is passed in to add to the current total
 */
public void add (int value) {
	total += value;
	saga = saga + " + " + value;
  }

  /**
   * This method will subtract the passed in value from the total variable.
 * @param value is passed in to subtract from the current total
 */
public void subtract (int value) {
	total -= value;
	saga = saga + " - " + value;
  }
/**
 *  This method will print the stored value in saga.
 */
  public String toString () {
    return saga;
  }

/**
 * This method clears all values stored in saga and total from the AddingMachine.
 */
public void clear() {
	saga = "0";
	total = 0;	
  }
}