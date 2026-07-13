import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("Charlie", "Labrador", 4, "Golden");
        dogs[1] = new Dog("Max", "German Shepherd", 2, "Black");
        dogs[2] = new Dog("Rocky", "Bulldog", 4, "White");
        dogs[3] = new Dog("Milo", "Husky", 1, "Gray & White");
        dogs[4] = new Dog("Buddy", "Poodle", 3, "Cream");

        System.out.println("DOG DETAILS");
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].details();
            System.out.println();
        }

    }
}
