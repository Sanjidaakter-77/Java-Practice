import java.lang.*;

public class Netflix extends StreamingPlatform
{
	private String topSeries;

	public Netflix()
	{
	}

	public Netflix(String company, double monthlySubscription, int launchYear, String topSeries)
	{
		super(company,monthlySubscription,launchYear);
		this.topSeries=topSeries;
	}

	public void setTopSeries(String topSeries)
	{
		this.topSeries=topSeries;
	}

	public String getTopSeries()
	{
		return topSeries;
	}

	public void details()
	{
		super.details();
		System.out.println("Top Series: "+topSeries);
	}
}