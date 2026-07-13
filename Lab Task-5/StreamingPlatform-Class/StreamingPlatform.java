import java.lang.*;

public class StreamingPlatform
{
	private String company;
	private double monthlySubscription;
	private int launchYear;

	public StreamingPlatform()
	{
	}

	public StreamingPlatform(String company, double monthlySubscription, int launchYear)
	{
		this.company=company;
		this.monthlySubscription=monthlySubscription;
		this.launchYear=launchYear;
	}

	public void setCompany(String company)
	{
		this.company=company;
	}

	public String getCompany()
	{
		return company;
	}

	public void setMonthlySubscription(double monthlySubscription)
	{
		this.monthlySubscription=monthlySubscription;
	}

	public double getMonthlySubscription()
	{
		return monthlySubscription;
	}

	public void setLaunchYear(int launchYear)
	{
		this.launchYear=launchYear;
	}

	public int getLaunchYear()
	{
		return launchYear;
	}

	public void details()
	{
		System.out.println("Company: "+company);
		System.out.println("Monthly Subscription: "+monthlySubscription);
		System.out.println("Launch Year: "+launchYear);
	}
}