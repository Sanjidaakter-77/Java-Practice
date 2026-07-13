import java.lang.*;
public class Start {
    public static void main(String[] args) {

        Bird[] birds = new Bird[5];

        birds[0] = new Bird("Rio", "Parrot", "Green", 1.2);
        birds[1] = new Bird("Snow", "Cockatoo", "White", 0.9);
        birds[2] = new Bird("Snowy", "Penguin", "Black & White", 20.0);
        birds[3] = new Bird("Pico", "Peacock", "Blue & Green", 5.0);
        birds[4] = new Bird("Tweety", "Canary", "Yellow", 0.3);

        System.out.println("BIRD DETAILS");
        for (int i = 0; i < birds.length; i++) {
            birds[i].details();
            System.out.println();
        }

    }
}
