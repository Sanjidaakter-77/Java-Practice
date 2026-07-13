import java.lang.*;
public class Start {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setName("Rio");
        b1.setSpecies("Parrot");
        b1.setColor("Green");
        b1.setWeight(1.2);

        Bird b2 = new Bird();
        b2.setName("Snow");
        b2.setSpecies("Cockatoo");
        b2.setColor("White");
        b2.setWeight(0.9);

        Bird b3 = new Bird();
        b3.setName("Snowy");
        b3.setSpecies("Penguin");
		b3.setColor("Black & White");
        b3.setWeight(20.0);

        Bird b4 = new Bird();
        b4.setName("Pico");
        b4.setSpecies("Peacock");
		b4.setColor("Blue & Green");
        b4.setWeight(5.0);

        System.out.println("Name: " + b1.getName() + ", " + "Species: " + b1.getSpecies() + ", " + "Color: " + b1.getColor() + ", " + "Weight: " + b1.getWeight() + "kg");
        System.out.println("Name: " + b2.getName() + ", " + "Species: " + b2.getSpecies() + ", " + "Color: " + b2.getColor() + ", " + "Weight: " + b2.getWeight() + "kg");
        System.out.println("Name: " + b3.getName() + ", " + "Species: " + b3.getSpecies() + ", " + "Color: " + b3.getColor() + ", " + "Weight: " + b3.getWeight() + "kg");
        System.out.println("Name: " + b4.getName() + ", " + "Species: " + b4.getSpecies() + ", " + "Color: " + b4.getColor() + ", " + "Weight: " + b4.getWeight() + "kg");
    }
}
