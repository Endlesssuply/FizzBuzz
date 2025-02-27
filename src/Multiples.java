public class Multiples {
    public static void main(String[] args) {
        //Count how many multiples of 3 and 5 there are between 1 and 1000.
        int n = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                n++;
            }
        }
        System.out.println(n);
    }
}
