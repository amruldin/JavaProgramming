

import java.util.Scanner;
public class Check {

	public static void main(String[] args) {

		int count =0 ;
		boolean run = true;
		String stn = "exit";
		Scanner scan = new Scanner(System.in);
		
		
		while (run == true)
		{
			
			System.out.println("Enter Something : ");
			String in = "";
			in = scan.next();
			
			System.out.println(in);
			
			if(in.equalsIgnoreCase(stn))
			{
				System.out.println("T");
				run = false;
			}
			else
			{
				System.out.println("F");

				
			}
			
		}
		System.out.println("Bye!!!!");
		
//		do
//		{
//			System.out.println("Press E to Exit:  ");
//			in = scan.nextLine();
//			count++;
//		}
//		while(in != "exit");
		
		
		
	}

}
