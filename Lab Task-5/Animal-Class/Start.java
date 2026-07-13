import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		System.out.println("CAT DETAILS :");
		Cat c1=new Cat("Luna",2,"White","Persian");
		c1.details();
		Cat c2=new Cat();
		c2.setName("Minnie");
		c2.setAge(3);
		c2.setColor("Orange");
		c2.setBreed("Munchkin");
		c2.details();
		
		System.out.println();
		
		System.out.println("DOG DETAILS :");
		Dog d1=new Dog("Buddy",4,"Brown","Chicken");
		d1.details();
		Dog d2=new Dog();
		d2.setName("Tommy");
		d2.setAge(2);
		d2.setColor("Golden");
		d2.setFavoriteFood("Salmon");
		d2.details();
	}
}