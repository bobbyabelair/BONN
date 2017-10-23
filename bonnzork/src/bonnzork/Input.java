package bonnzork;

import java.util.Scanner;
public class Input {
	

		public static String getInput() {
			System.out.print("> ");
			Scanner inp = new Scanner(System.in);
			String input = inp.nextLine();
			input.toLowerCase();
			return input;
		}
	
	}



