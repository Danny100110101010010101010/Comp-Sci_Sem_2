import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner y = new Scanner(System.in);
	Random w = new Random();
	int e = w.nextInt(1000)+1;
	System.out.println("Pick a numnber between 1 - 1000");
	int r = y.nextInt();
	boolean t = e==r;
	if(t)
	{
	System.out.print("The number you guessed was greater, The number was"+e);
	}
	else 
	{
	System.out.print("The number you guessed was smaller, The number was"+e);
		}
	}
}
	

