import java.lang.*;

public class DisneyCharacter
{
	private String movie;
	private int releaseYear;
	private String kingdom;

	public DisneyCharacter()
	{
	}

	public DisneyCharacter(String movie, int releaseYear, String kingdom)
	{
		this.movie=movie;
		this.releaseYear=releaseYear;
		this.kingdom=kingdom;
	}

	public void setMovie(String movie)
	{
		this.movie=movie;
	}

	public String getMovie()
	{
		return movie;
	}

	public void setReleaseYear(int releaseYear)
	{
		this.releaseYear=releaseYear;
	}

	public int getReleaseYear()
	{
		return releaseYear;
	}

	public void setKingdom(String kingdom)
	{
		this.kingdom=kingdom;
	}

	public String getKingdom()
	{
		return kingdom;
	}

	public void details()
	{
		System.out.println("Movie: "+movie);
		System.out.println("Release Year: "+releaseYear);
		System.out.println("Kingdom: "+kingdom);
	}
}