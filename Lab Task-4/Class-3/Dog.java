import java.lang.*;
public class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog() {

    }

    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

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

    public void details() {
        System.out.println("Name:" + name);
        System.out.println("Breed:" + breed);
        System.out.println("Age:" + age + " year");
        System.out.println("Color:" + color);
    }

}
