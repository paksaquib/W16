/**
 * 
 */

/**
 * @author dhuynh
 *
 */
/*--------------- Parent Class Dic ---------------*/
public class Dice {
	  private int numberofrolls = 0;
	  private int numberofdices = 1;
	  private int[] rollHistory = {0,0,0,0,0,0,0,0,0,0};
	  private int norolldicehistory = 0;
	 

	  public void setDiceCount(int n ){
	  /*--------------- Set number of dices ---------------*/
		  numberofdices = n;
	  }
	  
	  public Dice(){
	  /*--------------- Dice Constructor    ---------------*/
		  numberofrolls = 0;
		  numberofdices = 1;
	  }
	  
	  public int RollDice()
	  /*--------------- Roll Dice(s) and increment RollCounts    ---------------*/
	  {
		int rndno;
		rndno = (1 + (int) (Math.random() *  6))* numberofdices;
		numberofrolls = numberofrolls + numberofdices ;
		if (numberofrolls < 10)	
		{
			rollHistory[norolldicehistory] = rndno; 
			norolldicehistory ++;
		}
		else
		{
			for (int i=0; i < 9 ; i++)
			{
				rollHistory[i] = rollHistory[i + 1];
				
			}
			rollHistory[9] = rndno;
		}
		
	  	return rndno;
	  }
	  
	  public String rollhistory()
	  {
		  String rollhistorystr="Last 10 Roll Dice Value is ";
		  
		  for (int i=9; i >=0 ; i--)
		  {
			  if (rollHistory[i] != 0) 
			  {
				  rollhistorystr = rollhistorystr + "\n " + (i + 1) + " is " + rollHistory[i];				  
			   }
			   
		  }
		  return rollhistorystr;
	  }
	  
	  public int RollCount()
	  {
	  	return numberofrolls;
	  }
	  
	  public String RollCountMsg()
	  {
	  	return "Dices rolled thus far: " + numberofrolls ;
	  }
	  
}
