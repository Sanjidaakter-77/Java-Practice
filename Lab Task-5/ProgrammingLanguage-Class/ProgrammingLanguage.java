import java.lang.*;

public class ProgrammingLanguage
{
	private String developer;
	private int releaseYear;
	private String type;

	public ProgrammingLanguage()
	{
	}

	public ProgrammingLanguage(String developer, int releaseYear, String type)
	{
		this.developer=developer;
		this.releaseYear=releaseYear;
		this.type=type;
	}

	public void setDeveloper(String developer)
	{
		this.developer=developer;
	}

	public String getDeveloper()
	{
		return developer;
	}

	public void setReleaseYear(int releaseYear)
	{
		this.releaseYear=releaseYear;
	}

	public int getReleaseYear()
	{
		return releaseYear;
	}

	public void setType(String type)
	{
		this.type=type;
	}

	public String getType()
	{
		return type;
	}

	public void details()
	{
		System.out.println("Developer: "+developer);
		System.out.println("Release Year: "+releaseYear);
		System.out.println("Type: "+type);
	}
}