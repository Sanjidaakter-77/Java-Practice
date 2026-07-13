import java.lang.*;
public class Start {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.setName("Thunder");
        h1.setColor("Brown");
        h1.setSpeed(65);
        h1.setHeight(1.6);

        Horse h2 = new Horse();
        h2.setName("Storm");
        h2.setColor("Black");
        h2.setSpeed(70);
        h2.setHeight(1.7);

        Horse h3 = new Horse();
        h3.setName("Blaze");
        h3.setColor("White");
        h3.setSpeed(60);
        h3.setHeight(1.5);

        Horse h4 = new Horse();
        h4.setName("Spirit");
        h4.setColor("Chestnut");
        h4.setSpeed(75);
        h4.setHeight(1.8);

        System.out.println("Name: " + h1.getName() + ", " + "Color: " + h1.getColor() + ", " + "Speed: " + h1.getSpeed() + "km/h, " + "Height: " + h1.getHeight() + " m");
        System.out.println("Name: " + h2.getName() + ", " + "Color: " + h2.getColor() + ", " + "Speed: " + h2.getSpeed() + "km/h, " + "Height: " + h2.getHeight() + " m");
        System.out.println("Name: " + h3.getName() + ", " + "Color: " + h3.getColor() + ", " + "Speed: " + h3.getSpeed() + "km/h, " + "Height: " + h3.getHeight() + " m");
        System.out.println("Name: " + h4.getName() + ", " + "Color: " + h4.getColor() + ", " + "Speed: " + h4.getSpeed() + "km/h, " + "Height: " + h4.getHeight() + " m");
    }
}
