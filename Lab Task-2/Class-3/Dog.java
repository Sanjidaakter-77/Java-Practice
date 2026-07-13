import java.lang.*;
public class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    public void setName(String name){
		this.name = name; 
	}
    public void setBreed(String breed){
		this.breed = breed; 
	}
    public void setAge(int age){
		this.age = age;
	}
    public void setColor(String color){
		this.color =color; 
	}

    public String getName(){
		return name; 
	}
    public String getBreed(){
		return breed; 
	}
    public int getAge(){
		return age; 
	}
    public String getColor(){ 
		return color; 
	}
}
