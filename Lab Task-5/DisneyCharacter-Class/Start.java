import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		System.out.println("DETAILS OF MOANA");
		Moana m1=new Moana("Moana",2016,"Motunui","Maui");
		m1.details();

		System.out.println();

		System.out.println("DETAILS OF CINDERELLA");
		Cinderella c1=new Cinderella("Cinderella",1950,"Dream Kingdom","Jaq");
		c1.details();
	}
}