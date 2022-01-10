import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.	
		Scanner sc = new Scanner(System.in);
		int a = 25;
		System.out.println("What would you like to call yourself?");
		String joe = sc.nextLine();
		System.out.println("What is your title? Mr, Ms, Mrs?");
		String mary = sc.nextLine();
		System.out.println("Choose, Wizard, Warrior, or Rogue?");
		String david = sc.nextLine();
		System.out.println("Every trait has a max of 10 points each. You have 25 points total");
		System.out.println("Choose your trait...");
		System.out.println("Strength - Choose your points");
		int gary = sc.nextInt();
		a = (a-gary);
		System.out.println("You now have " + a + " points");
		System.out.println("Intelligence - Choose your points");
		int danny = sc.nextInt();
		a = (a-danny);
		System.out.println("You now have " + a + " points");
		if(a > 0) {
		System.out.println("Dexterity - Choose your points");
		int cho = sc.nextInt();
		a = (a-cho);
		System.out.println("You now have " + a + " points");
		}
		else {
		System.out.println("You dont have any points left");
		}
		if(a > 0 ) {
		System.out.println("Constitution - Choose your points");
		int alan = sc.nextInt();
		a = (a-alan);
		}
		else {
		System.out.println("You dont have any points");
		}
		if(a > 0) {
		System.out.println("Charisma - Choose your points");
		int jake = sc.nextInt();
		a = (a-jake);
		System.out.println("You now have " + a + " points");
		}
		else {
		System.out.println("You dont have any points");
		}
		System.out.println("Here are " + mary + joe + " stats");
		System.out.println("Strength - " + gary);
		System.out.println("Intelligence - " + danny);
		System.out.println("Dexterity - " + cho);
		System.out.println("Constitution - " + alan);
		System.out.println("Charisma - " + jake);
		
		
		}
		}
		
		
		
		
		
		
		
		
				
				
				
			
				
			
		
