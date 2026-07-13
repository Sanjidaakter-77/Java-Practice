import java.lang.*;

public class Frontend extends Softwaredev
{
	private String framework;

	public Frontend()
	{
	}

	public Frontend(String projectName, String company, double version, String framework)
	{
		super(projectName,company,version);
		this.framework=framework;
	}

	public void setFramework(String framework)
	{
		this.framework=framework;
	}

	public String getFramework()
	{
		return framework;
	}

	public void details()
	{
		super.details();
		System.out.println("Framework: "+framework);
	}
}