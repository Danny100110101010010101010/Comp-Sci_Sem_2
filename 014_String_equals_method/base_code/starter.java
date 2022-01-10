import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your role Wizard, Warrior, or a Rogue");
		String tryone = sc.nextLine();
		if(tryone.equals("Wizard")) {
			System.out.println("You have choosen Wizard");
		}
		if(tryone.equals("Warrior")) {
			System.out.println("You have choosen Warrior");
		}
		if(tryone.equals("Rogue")) {
			System.out.println("You have choosen Rogue");
		}
		if(!tryone.equals("Warrior") && (!tryone.equals("Wizard") && (!tryone.equals("Rogue"))));
		System.out.println("You are the choosen one");
	}
		
	
}
