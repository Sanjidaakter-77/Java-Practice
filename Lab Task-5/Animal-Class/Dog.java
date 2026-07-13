import java.lang.*;

public class Dog extends Animal
{
	private String favoriteFood;

	public Dog()
	{
	}

	public Dog(String name,int age,String color,String favoriteFood)
	{
		super(name,age,color);
		this.favoriteFood=favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood)
	{
		this.favoriteFood=favoriteFood;
	}

	public String getFavoriteFood()
	{
		return favoriteFood;
	}

	public void details()
	{
		super.details();
		System.out.println("Favorite Food: "+favoriteFood);
	}
}