import java.lang.*;
public class Bird {
    private String name;
    private String species;
    private String color;
    private double weight;

    public void setName(String name){ 
		this.name = name;
	}
    public void setSpecies(String species){
		this.species = species; 
	}
    public void setColor(String color){
		this.color = color;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
    public String getName(){
		return name;
	}
    public String getSpecies(){
		return species;
	}
    public String getColor(){
		return color; 
	}
	public double getWeight(){
		return weight; 
	}
}
