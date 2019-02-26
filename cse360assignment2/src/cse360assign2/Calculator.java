/**------------------------------------------------------------------------------
// AUTHOR            : Nayan Arora
// CLASS ID          : 319  
// ASSIGNMENT NUMBER : Assignment 2
// DESCRIPTION       : Implement a class calculator.java and implementation on github.
//--------------------------------------------------------------------------------*/

package cse360assign2;


/**
 * @author nayanarora
 * The public class calculator has 7 methods to implement the working of a normal calculator. 
 * It can add, subtract, multiply or divide. It can also show history and calculate the total. 
 * It has one private member that is the integer variable total.
 */
public class Calculator {

	private int total;
	String trackHistory = "0"; // variable declaration to track history of operation and value.
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * The getTotal method is used for calculating the total after the implementation of the calculations.
	 * @return
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * The add method is used for adding the value parameter to the total to get the sum.
	 * @param value is used for getting user input and adding it to the total.
	 */
	public void add (int value) 
	{
		total = total + value;
		trackHistory = trackHistory + " + " + value;
	}
	
	/**
	 * The subtract method is used for subtracting the value parameter from the total to get the result.
	 * @param value is used for getting user input and subtracting it from total to get the final result.
	 */
	public void subtract (int value) 
	{
		total = total - value;
		trackHistory = trackHistory + " - " + value;
	}
	
	/**
	 * The multiply method is used for multiplying the value parameter with the total to get the result.
	 * @param value is used for getting the user input and multiplying that with total to get result.
	 */
	public void multiply (int value)
	{
		total = total * value;
		trackHistory = trackHistory + " * " + value;
	}
	
	/**
	 * The divide method is used for dividing the value with the value in total to get the result.
	 * @param value is used for getting user input and dividing that with the value in total to get the result.
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		
		total = total / value;
		trackHistory = trackHistory + " / " + value;
	}
	
	/**
	 * The getHistory method is used for returning the history of all actions as a string. 
	 * @return
	 */
	public String getHistory () 
	{
		return trackHistory;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	