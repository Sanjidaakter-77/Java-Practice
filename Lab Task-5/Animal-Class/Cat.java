import java.lang.*;

public class Cat extends Animal
{
	private String breed;

	public Cat()
	{
	}

	public Cat(String name,int age,String color,String breed)
	{
		super(name,age,color);
		this.breed=breed;
	}

	public void setBreed(String breed)
	{
		this.breed=breed;
	}

	public String getBreed()
	{
		return breed;
	}

	public void details()
	{
		super.details();
		System.out.println("Breed: "+breed);
	}
}