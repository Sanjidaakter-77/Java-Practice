import java.lang.*;
public class Fish {
    private String name;
    private String type;
    private double length;
    private String color;

    public Fish() {

    }

    public Fish(String name, String type, double length, String color) {
        this.name    = name;
        this.type    = type;
        this.length  = length;
        this.color = color;
    }

    public void setName(String name){
		this.name = name; 
		}
    public void setType(String type){
		  this.type = type; 
	  }
    public void setLength(double length){
		  this.length = length; 
	  }
    public void setColor(String color){
		  this.color = color; 
	  }

    public String getName(){
		  return name; 
	  }
    public String getType(){
		  return type; 
	  }
    public double getLength(){
		  return length; 
	  }
    public String getColor(){
		  return color; 
	  }

    public void details() {
        System.out.println("Name:" + name);
        System.out.println("Type:" + type);
        System.out.println("Length:" + length + " cm");
        System.out.println("Color:" + color);
    }

}
