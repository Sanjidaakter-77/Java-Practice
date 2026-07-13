import java.lang.*;
public class doublechar
{
	public static void main (String[] args)
	{
		double d1=64.2;
		char c1= 'S';
		System.out.println("Before imp c1:"+c1);
		c1=(char)d1;
		System.out.println("After imp c1:"+c1);
		
		char c2='A'; 
		double d2=22.1;
        System.out.println("Before imp d2:"+d2);
		d2=c2;
		System.out.println("After imp d2:"+d2);	
	}
}