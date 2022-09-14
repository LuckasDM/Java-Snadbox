//4th version of guess letter game

public class GuessLetter {

	public static void main(String[] args) 
		throws java.io.IOException{
		
		char ch, ignore, answer = 'K';
		
		do {
			System.out.println("I'm thinking of letter between A and Z.");
			System.out.print("Can you guess it?");
			
			//read character
			ch = (char) System.in.read();
			
			//discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			}while(ignore != '\n');
			
			
			if (ch == answer) System.out.println("** Right **");
			else {
				System.out.print("...Sorry, you're ");
				
				if(ch < answer) System.out.println("too low");
				else System.out.println("too high");
				
				System.out.println("Try again! \n");
			}
		}while (answer != ch);
		

	}

}
