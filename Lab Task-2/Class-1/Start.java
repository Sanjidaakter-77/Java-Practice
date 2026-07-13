import java.lang.*;
public class Start {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Oliver");
        c1.setColor("White");
        c1.setAge(3);
        c1.setWeight(4.2);

        Cat c2 = new Cat();
        c2.setName("Coco");
        c2.setColor("Black");
        c2.setAge(5);
        c2.setWeight(3.8);

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

        System.out.println("Name: " + c1.getName() + ", " + "Color: " + c1.getColor() + ", " + "Age: " + c1.getAge() + "year, " + "Weight: " + c1.getWeight() + "kg");
        System.out.println("Name: " + c2.getName() + ", " + "Color: " + c2.getColor() + ", " + "Age: " + c2.getAge() + "year, " + "Weight: " + c2.getWeight() + "kg");
        System.out.println("Name: " + c3.getName() + ", " + "Color: " + c3.getColor() + ", " + "Age: " + c3.getAge() + "year, " + "Weight: " + c3.getWeight() + "kg");
        System.out.println("Name: " + c4.getName() + ", " + "Color: " + c4.getColor() + ", " + "Age: " + c4.getAge() + "year, " + "Weight: " + c4.getWeight() + "kg");
    }
}
