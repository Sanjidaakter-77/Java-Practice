import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		System.out.println("DETAILS OF FRONTEND DEVELOPMENNT: ");
		Frontend f1=new Frontend("Food Delivery","Google",2.5,"React");
		f1.details();

		System.out.println();

		System.out.println("DETAILS OF BACKEND DEVELOPMENT: ");
		Backend b1=new Backend("Hospital Management","Microsoft",3.8,"MySQL");
		b1.details();
	}
}