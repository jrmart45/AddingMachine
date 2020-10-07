package cse360assignment02;
/**
 * 
 * @author Jemiah
 * Github link to repo: https://github.com/jrmart45/AddingMachine.git
 *
 */
public class main {
	   public static void main(String[] args) {
	       
		   // Creating a new Calculator object
	       AddingMachine myCalculator = new AddingMachine();
	       
	       // Passing values via method calls
	       myCalculator.add (4);
	       myCalculator.subtract (2);
	       myCalculator.add(5);
	       System.out.println(myCalculator.toString());
	       System.out.println("Solution: " + myCalculator.getTotal());
	       
	       // Testing the clear function
//	       myCalculator.clear();
//	       System.out.println(myCalculator.toString());
//	       System.out.println("Solution: " + myCalculator.getTotal());
	       
	   }
	}