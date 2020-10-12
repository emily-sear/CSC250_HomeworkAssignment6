import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BibleBookCollection 
{
	private ArrayList<BibleBook> theBooks;
	
	public BibleBookCollection()
	{
		this.theBooks = new ArrayList<BibleBook>();
	}
	
	public BibleBookCollection(String fileName)
	{
		//calls the default constructor
		this();
		try 
		{ 
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + fileName));
			while(input.hasNext())
			
				this.theBooks.add(new BibleBook(input.nextLine()));
		
			input.close();
		}
		catch(Exception e)
		{
			System.out.println("No Book Found");
		}
	}
	
	public void displayBooksInList()
	{
		for(int i = 0; i < theBooks.size(); i++)
		{
			theBooks.get(i).displayBook();
		}
	}
	
	//polymorphism
	public void addBibleBook(BibleBook b)
	{
		this.theBooks.add(b);
	}
	
	public void addBibleBook(String colonDelimitedData)
	{
		this.theBooks.add(new BibleBook(colonDelimitedData));
	}
	
	//you are advertising that either you get a book from me or and exception may be thrown
	public BibleBook getFirstBookGivenSearchTerm(String term) throws Exception 
	{
		for(int i = 0; i < this.theBooks.size(); i++)
		{
			if(this.theBooks.get(i).wordInSummary(term) != null)
			{
				return this.theBooks.get(i);
			}
		}
		
		throw new Exception("Term not found");
	}
	
	public void sortOnName()
	{
		int numSwaps;
		BibleBook temp;
		
		do
		{
			numSwaps = 0;
			for(int i = 0; i < theBooks.size() -1; i++)
			{
				if(theBooks.get(i).getBookName().compareToIgnoreCase(theBooks.get(i+1).getBookName()) > 0)
				{
					temp = theBooks.get(i);
					theBooks.set(i, theBooks.get(i + 1));
					theBooks.set((i+1), temp);
					theBooks.get(i).displayBook();
					theBooks.get(i+1).displayBook();
					numSwaps++;
				}
			}
		}
		while(numSwaps > 0);
	}
	
	public void sortOnChapterCount()
	{
			int numSwaps;
			BibleBook temp;
			
			do
			{
				numSwaps = 0;
				for(int i = 0; i < theBooks.size() -1; i++)
				{
					if(theBooks.get(i).getNumOfChapters() > theBooks.get(i+1).getNumOfChapters())
					{
						temp = theBooks.get(i);
						theBooks.set(i, theBooks.get(i + 1));
						theBooks.set((i+1), temp);
						numSwaps++;
					}
				}
			}
			while(numSwaps > 0);
		}
	}
