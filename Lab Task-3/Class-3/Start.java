import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Dog d1 = new Dog("Charlie", "Labrador", 4, "Golden");
		Dog d2 = new Dog("Max", "German Shepherd", 2, "Black");
		Dog d3 = new Dog();
		d3.setName("Rocky");
		d3.setBreed("Bulldog");
		d3.setAge(4);
		d3.setColor("White");
		Dog d4 = new Dog();
		d4.setName("Milo");
		d4.setBreed("Husky");
		d4.setAge(1);
		d4.setColor("Gray & white");

        System.out.println("DOG DETAILS");
        System.out.println("Dog 1:");
        d1.details();
        System.out.println("Dog 2:");
        d2.details();
        System.out.println("Dog 3:");
        d3.details();
        System.out.println("Dog 4:");
        d4.details();

    }
}
