/**
 * @author Ferdinand K. Yeke
 *
 */
public class RecDieRollerDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Makes new instance of RecDieRoller, which is die.
		/*
		RecDieRoller die = new RecDieRoller();
		//Die starts at 0.
		die.Roll(0);
		*/
		
		RecDieRoller1000 die1000 = new RecDieRoller1000();
		/*
		 * 0 is just the starting number for the die. It does not count as a 
		 * die roll.
		 */
		System.out.println(die1000.Roll(0)); 
		
		
		

	}//Main ends here

}//Class ends here.
