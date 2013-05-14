
public class DicTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice singleDice = new Dice();
		Dice x3Dice = new TrippleDice();
		
		System.out.println("Single roll output: " + singleDice.RollDice());
		System.out.println("Single roll output: " + singleDice.RollDice());
		System.out.println("Single roll output: " + singleDice.RollDice());

		System.out.println("TrippleDice roll output: " + x3Dice.RollDice());
		System.out.println("TrippleDice roll output: " + x3Dice.RollDice());
		System.out.println("TrippleDice roll output: " + x3Dice.RollDice());

		System.out.println("singleDice rollcount: " + singleDice.RollCountMsg());
		System.out.println("x3Dice rollcount: " + x3Dice.RollCountMsg());
		
		System.out.println("Roll 5 more times");
		for (int i = 0; i<5; i++)
		{
			singleDice.RollDice();
		}
		System.out.println(singleDice.rollhistory());
		System.out.println("Roll 5 more times");
		for (int i = 0; i<5; i++)
		{
			singleDice.RollDice();
		}
		System.out.println(singleDice.rollhistory());
	}

}
