import java.lang.*;
public class Start {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.setName("Nemo");
        f1.setType("Clownfish");
        f1.setLength(8.0);
        f1.setColor("Orange");

        Fish f2 = new Fish();
        f2.setName("Goldie");
        f2.setType("Goldfish");
        f2.setLength(12.0);
        f2.setColor("Golden");

        Fish f3 = new Fish();
        f3.setName("Spike");
        f3.setType("Swordfish");
        f3.setLength(300.0);
        f3.setColor("Silver");

        Fish f4 = new Fish();
        f4.setName("Bubbles");
        f4.setType("Betta");
        f4.setLength(7.0);
        f4.setColor("Blue");

        System.out.println("Name: " + f1.getName() + ", " + "Type: " + f1.getType() + ", " + "Length: " + f1.getLength() + "cm, " + "Color: " + f1.getColor());
        System.out.println("Name: " + f2.getName() + ", " + "Type: " + f2.getType() + ", " + "Length: " + f2.getLength() + "cm, " + "Color: " + f2.getColor());
        System.out.println("Name: " + f3.getName() + ", " + "Type: " + f3.getType() + ", " + "Length: " + f3.getLength() + "cm, " + "Color: " + f3.getColor());
        System.out.println("Name: " + f4.getName() + ", " + "Type: " + f4.getType() + ", " + "Length: " + f4.getLength() + "cm, " + "Color: " + f4.getColor());
    }
}
