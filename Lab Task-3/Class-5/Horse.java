import java.lang.*;
public class Horse {
    private String name;
    private String color;
    private int speed;
    private double height;

    public Horse() {

    }

    public Horse(String name, String color, int speed, double height) {
        this.name   = name;
        this.color  = color;
        this.speed  = speed;
        this.height = height;
    }

    public void setName(String name){ 
		this.name = name; 
	}
    public void setColor(String color){ 
		this.color = color; 
	}
    
	public void setSpeed(int speed){
		this.speed = speed; 
	}
	
    public void setHeight(double height){
		this.height = height; 
	}

    public String getName(){
		return name; 
	}
	
    public String getColor(){
		return color; 
	}
	
    public int getSpeed(){
		return speed; 
	}
	
    public double getHeight(){
		return height; 
	}

    public void details(){
        System.out.println("Name   : " + name);
        System.out.println("Color  : " + color);
        System.out.println("Speed  : " + speed + " km/h");
        System.out.println("Height : " + height + " m");
    }

}
