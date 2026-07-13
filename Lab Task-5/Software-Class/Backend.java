import java.lang.*;

public class Backend extends Softwaredev
{
	private String database;

	public Backend()
	{
	}

	public Backend(String projectName, String company, double version, String database)
	{
		super(projectName,company,version);
		this.database=database;
	}

	public void setDatabase(String database)
	{
		this.database=database;
	}

	public String getDatabase()
	{
		return database;
	}

	public void details()
	{
		super.details();
		System.out.println("Database: "+database);
	}
}