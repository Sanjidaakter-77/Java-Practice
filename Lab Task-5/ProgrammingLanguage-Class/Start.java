import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		System.out.println("DETAILS OF JAVA");
		Java j1=new Java("Oracle",1995,"Object Oriented","JDK 21");
		j1.details();

		System.out.println();
		
		System.out.println("DETAILS OF CPP");
		Cpp p1=new Cpp("C++ Software Foundation",1991,"Interpreted","3.12");
		p1.details();
	}
}