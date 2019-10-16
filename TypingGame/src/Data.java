
import java.util.Arrays;
import java.util.Random;

public class Data {
	
	protected String words[] = {"Tell","Say","Computer","Commission","Afghans","International", "Server"};
	protected int size = 10;
	protected int score;

	
	Random rnd = new Random();
	
	
	public Data()
	{
		
	}
	
	
	
	public String genWord()
	{
		int pos;
		String word;
		
		pos = rnd.nextInt(words.length);
		
		word = words[pos];
		return word;
		
	}
	
	public int checkInput(String input, String geneWord)
	{
		
		
		if(input.equalsIgnoreCase(geneWord))
		{
			score++;
		}
		
//		for(int i = 0;i<words.length;i++)
//		{
//			if(words[i] == input)
//			{
//				score++;
//			}
//		}
		
		return score;
		
	}



	@Override
	public String toString() {
		return "Data [words=" + Arrays.toString(words) + ", size=" + size + ", score=" + score + ", rnd=" + rnd + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

	

}
