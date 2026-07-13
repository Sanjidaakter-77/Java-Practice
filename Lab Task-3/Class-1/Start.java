import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Cat c1 = new Cat("Oliver", "White", 3, 4.2);
        Cat c2 = new Cat("Coco", "Black", 5, 3.8);
        Cat c3 = new Cat();
        c3.setName("Mochi");
        c3.setColor("Orange");
        c3.setAge(1);
        c3.setWeight(2.7);
        Cat c4 = new Cat();
        c4.setName("Luna");
        c4.setColor("Gray");
        c4.setAge(2);
        c4.setWeight(5.3);

        System.out.println("CAT DETAILS");
        System.out.println("Cat 1:");
        c1.details();
        System.out.println("Cat 2:");
        c2.details();
        System.out.println("Cat 3:");
        c3.details();
        System.out.println("Cat 4:");
        c4.details();

    }
}
