/**
 * 
 * @author Joshua Gonsalves
 * Dice Array
 *
 */
public class DiceArray {

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int[] rolls = new int [1000];
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven= 0;
		int twelve = 0;
		
			for (int i = 0; i < 1000; i++)
			{
				int roll1 = dice1.roll();
				int roll2 = dice2.roll();
				int sum = roll1 + roll2;
				
				rolls[i] = sum;
				if (sum == 2)
				two ++;
				else if (sum == 3)
				three ++;
				else if (sum == 4)
				four ++;
				else if (sum == 5)
				five ++;
				else if (sum == 6)
				six ++;
				else if (sum == 7)
				seven ++;
				else if (sum == 8)
				eight ++;
				else if (sum == 9)
				nine++;
				else if (sum == 10)
				ten ++;
				else if (sum == 11)
				eleven ++;
				else if (sum == 12)
				twelve ++;
				
			}
		
		System.out.println("You rolled two " + two + " times!");
		System.out.println("You rolled three " + three + " times!");
		System.out.println("You rolled four " + four + " times!");
		System.out.println("You rolled five " + five + " times!");
		System.out.println("You rolled six " + six + " times!");
		System.out.println("You rolled seven " + seven + " times!");
		System.out.println("You rolled eight " + eight + " times!");
		System.out.println("You rolled nine " + nine + " times!");
		System.out.println("You rolled ten " + ten + " times!");
		System.out.println("You rolled eleven " + eleven + " times!");
		System.out.println("You rolled twelve " + twelve + " times!");
		
	}

}
