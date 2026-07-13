import java.lang.*;

public class Java extends ProgrammingLanguage
{
	private String jdkVersion;

	public Java()
	{
	}

	public Java(String developer, int releaseYear, String type, String jdkVersion)
	{
		super(developer,releaseYear,type);
		this.jdkVersion=jdkVersion;
	}

	public void setJdkVersion(String jdkVersion)
	{
		this.jdkVersion=jdkVersion;
	}

	public String getJdkVersion()
	{
		return jdkVersion;
	}

	public void details()
	{
		super.details();
		System.out.println("JDK Version: "+jdkVersion);
	}
}