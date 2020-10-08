
public class Main
{
	public static void main(String[] args) throws Exception
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("/src/data.dat");
		BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("Paul");
		answer.displayBook();

	}
}
