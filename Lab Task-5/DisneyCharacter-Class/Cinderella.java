import java.lang.*;

public class Cinderella extends DisneyCharacter
{
	private String animalFriend;

	public Cinderella()
	{
	}
	
	public Cinderella(String movie, int releaseYear, String kingdom, String animalFriend)
	{
		super(movie,releaseYear,kingdom);
		this.animalFriend=animalFriend;
	}

	public void setAnimalFriend(String animalFriend)
	{
		this.animalFriend=animalFriend;
	}

	public String getAnimalFriend()
	{
		return animalFriend;
	}

	public void details()
	{
		super.details();
		System.out.println("Animal Friend: "+animalFriend);
	}
}