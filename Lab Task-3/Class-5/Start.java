import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Horse h1 = new Horse("Thunder", "Brown", 65, 1.6);
        Horse h2 = new Horse("Storm", "Black", 70, 1.7);
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

        System.out.println("HORSE DETAILS");
        System.out.println("Horse 1:");
        h1.details();
        System.out.println("Horse 2:");
        h2.details();
        System.out.println("Horse 3:");
        h3.details();
        System.out.println("Horse 4:");
        h4.details();

    }
}
