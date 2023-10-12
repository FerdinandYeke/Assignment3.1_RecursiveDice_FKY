/**
 * @author Ferdinand K. Yeke
 *
 */
/*
	 * The class RecDieRoller1000 is a class that rolls a die and returns its face value.
	 * it contains a method called Roll, which is a recursive method that randomly generates a number
	 * while printing out what that number is other than 2. If if finds two, then
	 * it returns the face and ends. Otherwise Roll continuously calls dieFace until it finds 2.
	 * 
	 * 
	 * This Class is similar to the other RecDieRoller, However with this one, it rolls the 
	 * die 1000 times, counting each sequence of rolls it takes to get to a SINGLE 2. It does this
	 * 1000 times RECURSIVLY.
	 */
import java.util.ArrayList;
import java.util.Random;
public class RecDieRoller1000 {
	
	//This is variable that holds the die number.
	private int dieFace;
	
	/*The totalRolls variable is the amount of rolls that will be used 
	 * for the recursive Roll method for going up to 1000, incremented by
	 * 1.
	 */
	private int totalRolls = 0;
	
	/*
	 * The variable rCount is the amount of rolls it takes to get
	 * a SINGLE 2. It gets incremented 1 times until it sees a two.
	 */
	private int rCount = 0;
	
	Random rand = new Random();
	
	/**
	 * @param dieFace inputs the dieFace value in a recursive process. 
	 * 
	 * If the dieFace is equal to two (the base case) but the totalRolls is less than
	 * 1000, it will return Roll(dieFace) while totalRolls is incremented by 1. 
	 * But if the dieFace does not equal 2, totalRolls is less than 
	 * 1000 OR the dieFace is 0 AND the totalRolls is less
	 * than 1000, totalRolls and rCount are incremented by 1, and return Roll(dieFace).
	 * Otherwise, print out the dieFace, rCount, and return the rCount by its mean.
	 */
	public int Roll(int dieFace)
	{
		/**
		 * @return Roll(dieFace) if it equals two BUT IF the total/totalRolls is LESS
		 * than 1000
		 */
		if(dieFace==2 && totalRolls < 1000)
		{
			System.out.println("The Roll is: "+dieFace);
			System.out.println("It took "+rCount+" rolls to get to this single 2.");
			totalRolls++;//
			int randFaces = rand.nextInt(1,7);
			dieFace = randFaces;
			return Roll(dieFace);
		}
		
		/**
		 * @return dieFace once the recursion finds the the random number 2.
		 */
		
		else if(dieFace != 2 && totalRolls < 1000 || dieFace == 0 && totalRolls < 1000)
		{
			/*This actually represents 1 from 6 faces, since we are starting from 0 all the way to 6, where 6 is
			 * the seventh number, and 0 is the first. So the bound 1,7 is the same as 1,7-1.
			 */
			int randFaces = rand.nextInt(1,7);  
			System.out.println("The Roll is: "+dieFace);
			dieFace = randFaces; //dieFace contains a number ranging from 1 to 6, like an actual die.
			totalRolls++;
			rCount++;
			return Roll(dieFace);	
		}
		
		else
		{
			System.out.println("The Roll is: "+dieFace);
			System.out.println("It took "+rCount+" rolls to get to this single 2.");
			System.out.println("The mean number of "+rCount+" rolls are:");
			return 1000/rCount;//The mean.
		}

	}//Roll method ends here
	
}//Class ends here
