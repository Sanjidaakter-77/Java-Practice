import java.lang.*;

public class Softwaredev
{
	private String projectName;
	private String company;
	private double version;

	public Softwaredev()
	{
	}

	public Softwaredev(String projectName, String company, double version)
	{
		this.projectName=projectName;
		this.company=company;
		this.version=version;
	}

	public void setProjectName(String projectName)
	{
		this.projectName=projectName;
	}

	public String getProjectName()
	{
		return projectName;
	}

	public void setCompany(String company)
	{
		this.company=company;
	}

	public String getCompany()
	{
		return company;
	}

	public void setVersion(double version)
	{
		this.version=version;
	}

	public double getVersion()
	{
		return version;
	}

	public void details()
	{
		System.out.println("Project Name: "+projectName);
		System.out.println("Company: "+company);
		System.out.println("Version: "+version);
	}
}