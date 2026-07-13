import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		System.out.println("DETAILS OF NETFLIX: ");
		Netflix n1=new Netflix("Netflix Inc.",15.99,1997,"Stranger Things");
		n1.details();

		System.out.println();

		System.out.println("DETAILS OF DISNEYPLUS: ");
		DisneyPlus d1=new DisneyPlus("Disney",9.99,2019,"Frozen");
		d1.details();
	}
}