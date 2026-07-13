import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Horse[] horses = new Horse[5];

        horses[0] = new Horse("Thunder", "Brown", 65, 1.6);
        horses[1] = new Horse("Storm", "Black", 70, 1.7);
        horses[2] = new Horse("Blaze", "White", 60, 1.5);
        horses[3] = new Horse("Spirit", "Chestnut", 75, 1.8);
        horses[4] = new Horse("Shadow", "Dark Gray", 55, 1.55);

        System.out.println("HORSE DETAILS");
        for (int i = 0; i < horses.length; i++) {
            horses[i].details();
            System.out.println();
        }

    }
}
