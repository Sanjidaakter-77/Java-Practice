import java.lang.*;

public class intfloat{
	public static void main(String[]args){ 
		int i1 = 4662;
		float f1= 1254.7F;
		System.out.println("Before imp f1:"+f1);
		f1=i1;
		System.out.println("After imp f1:"+f1);
		
		float f2= 645.2F;
		int i2= 21;
		System.out.println("Before imp i2:"+i2);
		i2=(int)f2;
		System.out.println("After imp i2:"+i2);		
	}
}
	