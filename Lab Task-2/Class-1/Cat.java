import java.lang.*;
public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;

    public void setName(String name){ 
		this.name = name; 
	}
    public void setColor(String color){
		this.color = color; 
	}
    public void setAge(int age){
		this.age = age;
	}
    public void setWeight(double weight){ 
		this.weight = weight;
	}

    public String getName(){
		return name; 
	}
    public String getColor(){ 
		return color;
	}
    public int getAge(){ 
		return age; 
	}
    public double getWeight(){ 
		return weight;
	}
}
