public class Loops {
    public static void main(String args[]) {
        int counter = 0;

        for (counter = 0; counter < 15; counter += 1) {
            System.out.println("Hello_World ! ");
        }
        while (counter < 15) {
            System.out.println(counter);
            counter++;
        }
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 15);
    }
}