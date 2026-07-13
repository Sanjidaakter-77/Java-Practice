import java.lang.*;
public class Horse {
    private String name;
    private String color;
    private int speed;
    private double height;

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
}
