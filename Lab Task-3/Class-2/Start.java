import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Bird b1 = new Bird("Rio", "Parrot","Green", 1.2);
        Bird b2 = new Bird("Snow","Cockatoo","White",0.9);
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
        

        System.out.println("BIRD DETAILS");
        System.out.println("Bird 1:");
        b1.details();
        System.out.println("Bird 2:");
        b2.details();
        System.out.println("Bird 3:");
        b3.details();
        System.out.println("Bird 4:");
        b4.details();

    }
}
