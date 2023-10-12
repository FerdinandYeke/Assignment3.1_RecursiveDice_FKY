/**
 * @author Ferdinand K. Yeke
 *
 */
/*
	 * The class RecDieRoller is a class that rolls a die and returns its face value.
	 * it contains a method called Roll, which is a recursive method that randomly generates a number
	 * while printing out what that number is other than 2. If if finds two, then
	 * it returns the face and ends. Otherwise Roll continuously calls dieFace until it finds 2.
	 */
import java.util.Random;
public class RecDieRoller {
	
	//This is variable that holds the die number.
	private int dieFace;
	
	Random rand = new Random();
	
	/**
	 * @param dieFace inputs the dieFace value in a recursive process.
	 */
	public int Roll(int dieFace)
	{
		/**
		 * @return dieFace if it equals two
		 */
		if(dieFace==2)
		{
			System.out.println("The Roll is: "+dieFace);
			return dieFace;
		}
		
		/**
		 * @return dieFace once the recursion finds the the random number 2.
		 */
		else
		{
			/*This actually represents 1 from 6 faces, since we are starting from 0 all the way to 6, where 6 is
			 * the seventh number, and 0 is the first. So the bound 1,7 is the same as 1,7-1.
			 */
			int randFaces = rand.nextInt(1,7);  
			System.out.println("The Roll is: "+dieFace);
			dieFace = randFaces; //dieFace contains a number ranging from 1 to 6, like an actual die.
			return Roll(dieFace);
		}
	}//Roll method ends here

}//Class ends here
