import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/data.dat"));
		ArrayList<String> myNumbers = new ArrayList<String>();
		while(input.hasNext())
		{
			myNumbers.add(input.nextLine());
		}
		input.close();
		
		for(int i = 0; i < myNumbers.size(); i++)
		{
			System.out.println(myNumbers.get(i).length());
		}
		
		TestObject to = new TestObject();
		System.out.println(to);
		
		
	}
	
	
	static void fillFileWithRandomNumbers(int howMany) throws Exception
	{
		Random r = new Random();
		File f = new File(System.getProperty("user.dir") + "/src/data.dat");
		FileWriter writer = new FileWriter(f, false); //overwrites the file
		for(int i = 0; i < howMany; i++)
		{
			writer.write("" + r.nextInt(10000) + "\n");
		}
		writer.close();
	}
}
