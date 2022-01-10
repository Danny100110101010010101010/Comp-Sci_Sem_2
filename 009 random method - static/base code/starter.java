import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random(); 
		int d = rand.nextInt(10);
		System.out.println(d);
		int s = rand.nextInt(101);
		System.out.println(s);
		double a = rand.nextDouble() + rand.nextInt(1) + 3.5;
		System.out.println(a);
		double g = rand.nextDouble() + rand.nextInt(575) + 14;
		System.out.println(g);
	}
}
