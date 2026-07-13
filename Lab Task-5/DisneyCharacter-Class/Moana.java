import java.lang.*;

public class Moana extends DisneyCharacter
{
	private String companion;

	public Moana()
	{
	}

	public Moana(String movie, int releaseYear, String kingdom, String companion)
	{
		super(movie,releaseYear,kingdom);
		this.companion=companion;
	}

	public void setCompanion(String companion)
	{
		this.companion=companion;
	}

	public String getCompanion()
	{
		return companion;
	}

	public void details()
	{
		super.details();
		System.out.println("Companion: "+companion);
	}
}