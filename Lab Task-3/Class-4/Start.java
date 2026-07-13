import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Fish f1 = new Fish("Nemo", "Clownfish", 8.0, "Orange");
        Fish f2 = new Fish("Goldie", "Goldfish", 12.0, "Golden");

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

        System.out.println("FISH DETAILS");
        System.out.println("Fish 1:");
        f1.details();
        System.out.println("Fish 2:");
        f2.details();
        System.out.println("Fish 3:");
        f3.details();
        System.out.println("Fish 4:");
        f4.details();

    }
}
