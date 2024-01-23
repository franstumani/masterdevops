import java.util.Random;

public class Controller {

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100); // Change 100 to the desired range
    }

    public static void main(String[] args) {
        int random = generateRandomNumber();
        System.out.println("Random Number: " + random);
    }
}