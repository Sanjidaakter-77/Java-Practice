import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Oliver", "White", 3, 4.2);
        cats[1] = new Cat("Coco", "Black", 5, 3.8);
        cats[2] = new Cat("Mochi", "Orange", 1, 2.7);
        cats[3] = new Cat("Luna", "Gray", 2, 5.3);
        cats[4] = new Cat("Bella", "Brown", 4, 3.5);

        System.out.println("CAT DETAILS");
        for (int i = 0; i < cats.length; i++) {
            cats[i].details();
            System.out.println();
        }

    }
}
