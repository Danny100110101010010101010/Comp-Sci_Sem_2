import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("type your first number");
		int a = sc.nextInt();
		System.out.println("type your second number");
		int b = sc.nextInt();
		if (a != b) {
			System.out.println("They are not the same");
		}
	}
}

		
	

