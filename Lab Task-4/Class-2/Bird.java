import java.lang.*;
public class Bird {
    private String name;
    private String species;
    private String color;
    private double weight;
    public Bird() {

    }

    public Bird(String name, String species, String color, double weight) {
        this.name    = name;
        this.species = species;
        this.color   = color;
		this.weight  = weight;
    }

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

    public void details() {
        System.out.println("Name:" + name);
        System.out.println("Species:" + species);
        System.out.println("Color:" + color);
        System.out.println("Weight:" +weight + "Kg");
    }

}
