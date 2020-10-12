import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("/src/data.dat");
		BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("Paul");
		//answer.displayBook();
			
		theNewTestament.displayBooksInList();
		theNewTestament.sortOnName();
		System.out.println("________________________________________");
		theNewTestament.displayBooksInList();
		System.out.println("________________________________________");
		theNewTestament.sortOnChapterCount();
		theNewTestament.displayBooksInList();
		

	}
	
	//Bubble Sort with Numbers 
	static void bubbleSort(int[] ar)
	{
		int numSwaps;
		int temp;
		
		do
		{
			numSwaps = 0;
			for(int i = 0; i < ar.length-1; i++ )
			{
				if(ar[i] > ar[i+1])
				{
					temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
					numSwaps++;
				}
			}
		}
		while(numSwaps > 0);
	}
}
