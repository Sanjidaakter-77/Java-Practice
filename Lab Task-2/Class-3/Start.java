import java.lang.*;
public class Start {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Charlie");
        d1.setBreed("Labrador");
        d1.setAge(4);
        d1.setColor("Golden");

        Dog d2 = new Dog();
        d2.setName("Max");
        d2.setBreed("German Shepherd");
        d2.setAge(2);
        d2.setColor("Black");

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

        System.out.println("Name: " + d1.getName() + ", " + "Breed: " + d1.getBreed() + ", " + "Age: " + d1.getAge() + "year, " + "Color: " + d1.getColor());
        System.out.println("Name: " + d2.getName() + ", " + "Breed: " + d2.getBreed() + ", " + "Age: " + d2.getAge() + "year, " + "Color: " + d2.getColor());
        System.out.println("Name: " + d3.getName() + ", " + "Breed: " + d3.getBreed() + ", " + "Age: " + d3.getAge() + "year, " + "Color: " + d3.getColor());
        System.out.println("Name: " + d4.getName() + ", " + "Breed: " + d4.getBreed() + ", " + "Age: " + d4.getAge() + "year, " + "Color: " + d4.getColor());
    }
}
