import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<BibleBook> dataList = new ArrayList<BibleBook>();
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/data.dat"));
		while(input.hasNext())
		{
			dataList.add(new BibleBook(input.nextLine()));
		}
		
		input.close();
		
	
		input = new Scanner(System.in);
		System.out.println("What word do you want to find the first instance of in the summaries?");
		String word = input.next();
		
		for(int i = 0; i < dataList.size(); i++)
		{
			if(dataList.get(i).wordInSummary(word) != null)
			{
				dataList.get(i).displayBook();
				break;
			}
		}

	}
}
