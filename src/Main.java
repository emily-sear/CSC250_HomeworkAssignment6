import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList dataList = new ArrayList();
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/data.dat"));
		while(input.hasNext())
		{
			dataList.add(input.nextLine());
		}
		/**
		
		for(int i = 0; i < dataList.size(); i++)
		{
			System.out.println(dataList.get(i).toString());
		}
		**/
		BibleBook[] newTestament = new BibleBook[dataList.size()];
		for(int i = 0; i < newTestament.length; i++)
		{
			newTestament[i] = new BibleBook(dataList.get(i).toString());
			newTestament[i].displayBook();
			System.out.println();
		}


	}
}
