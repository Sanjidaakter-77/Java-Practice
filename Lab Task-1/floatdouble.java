import java.lang.*;
public class floatdouble
{
    public static void main(String[]args)
    { 
        float f1 =64.2F;
        double d1=422.1;	
        System.out.println("Before imp d1:"+d1);
        d1=f1;
        System.out.println("After imp d1:"+d1);

        double d2= 254.578;
        float f2=9753.02F;
        System.out.println("Before imp f2 :"+f2);
        f2=(float)d2;
        System.out.println("After imp f2:"+f2);
    }
}
	