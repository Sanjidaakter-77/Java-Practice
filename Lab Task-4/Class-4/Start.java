import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Fish[] fishes = new Fish[5];

        fishes[0] = new Fish("Nemo", "Clownfish", 8.0, "Orange");
        fishes[1] = new Fish("Goldie", "Goldfish", 12.0, "Golden");
        fishes[2] = new Fish("Spike", "Swordfish", 300.0, "Silver");
        fishes[3] = new Fish("Bubbles", "Betta", 7.0, "Blue");
        fishes[4] = new Fish("Sharky", "Shark", 500.0, "Gray");

        System.out.println("FISH DETAILS");
        for (int i = 0; i < fishes.length; i++) {
            fishes[i].details();
            System.out.println();
        }

    }
}
