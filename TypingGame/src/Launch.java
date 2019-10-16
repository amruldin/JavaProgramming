import java.util.Scanner;


public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		String usrInput;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		Data data = new Data();
		
		do {
			//
			
			System.out.println("\n\n***************************************");
			String wo = data.genWord();
			System.out.println(wo);
			System.out.println("***************************************");
			
			System.out.println("\t\t\n\nEnter the word or Exit to End : ");
			usrInput = scan.nextLine();
			score = data.checkInput(usrInput, wo);
		//	System.out.println(usrInput + "  " + wo);
			
			
			
		} while (!(usrInput.equalsIgnoreCase("exit")));
		
		System.out.println("Score : " + score);
		System.out.println("See you Soon!!!");
		

	}

}
