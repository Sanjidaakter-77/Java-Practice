import java.lang.*;

public class DisneyPlus extends StreamingPlatform
{
	private String popularMovie;

	public DisneyPlus()
	{
	}

	public DisneyPlus(String company, double monthlySubscription, int launchYear, String popularMovie)
	{
		super(company,monthlySubscription,launchYear);
		this.popularMovie=popularMovie;
	}

	public void setPopularMovie(String popularMovie)
	{
		this.popularMovie=popularMovie;
	}

	public String getPopularMovie()
	{
		return popularMovie;
	}

	public void details()
	{
		super.details();
		System.out.println("Popular Movie: "+popularMovie);
	}
}