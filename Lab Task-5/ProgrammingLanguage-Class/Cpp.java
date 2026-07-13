import java.lang.*;

public class Cpp extends ProgrammingLanguage
{
	private String cppVersion;

	public Cpp()
	{
	}

	public Cpp(String developer, int releaseYear, String type, String cppVersion)
	{
		super(developer,releaseYear,type);
		this.cppVersion=cppVersion;
	}

	public void setCppVersion(String cppVersion)
	{
		this.cppVersion=cppVersion;
	}

	public String getCppVersion()
	{
		return cppVersion;
	}

	public void details()
	{
		super.details();
		System.out.println("C++ Version: "+cppVersion);
	}
}