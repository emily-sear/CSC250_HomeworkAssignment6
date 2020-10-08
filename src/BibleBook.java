
public class BibleBook 
{
	//the private methods/instances are only accessible within a class
	//if you don't put anything in front it is package level security... as long as you are in the 
	//same directory you are fine
	//protected is inside the class or children of the class
	
	//make them private initally, but if you need them to be less than private you can change them later if you need
	private String bookName;
	private int numOfChapters;
	private String summaryOfBook;
	
	public BibleBook(String bookName, int numofChapters, String summaryOfBook)
	{
		this.bookName = bookName;
		this.numOfChapters = numofChapters;
		this.summaryOfBook = summaryOfBook;
	}
	public BibleBook(String commaDelimited)
	{
		String[] parts = commaDelimited.split(":");
		this.bookName = parts[0];
		this.numOfChapters = Integer.parseInt(parts[1]);
		this.summaryOfBook = parts[2];
		
	}
	
	//Source and then generate... you can generate these automatically
	public int getNumOfChapters() 
	{
		return numOfChapters;
	}


	public String getSummaryOfBook() 
	{
		return summaryOfBook;
	}

	public int addSumsNonStatic(int a, int b)
	{
		return a + b;
	}
	
	//a "getter"- a function that exposes a private field
	public String getBookName()
	{
		return this.bookName;
	}
	
	//with a setter, you are able to wrap the setting in some logic to check to see if it is what you want
	public void setBookName(String newName)
	{
		if(newName.length() >= 5)
		{
			this.bookName = newName;
		}
	}
	
	public void displayBook()
	{
		String display = this.bookName + ": " + this.numOfChapters + " chapters" + "\n" + this.summaryOfBook;
		System.out.println(display);
		
	}
	
	public String wordInSummary(String word)
	{
		if(this.summaryOfBook.toLowerCase().contains(word.toLowerCase()))
		{
			return this.bookName;
		}
		else
		{
			return null;
		}
	}
}
