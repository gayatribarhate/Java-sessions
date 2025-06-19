public class PlusModified {
    public static void main(String[] args) {
        int a, b;

        // Pre-increment
        a = 15;
        b = ++a;  // a → 16, then b = 16
        System.out.println("Pre-increment: a = " + a + ", b = " + b);

        // Post-increment
        a = 15;
        b = a++;  // b = 15, then a → 16
        System.out.println("Post-increment: a = " + a + ", b = " + b);

        // Pre-decrement
        a = 15;
        b = --a;  // a → 14, then b = 14
        System.out.println("Pre-decrement: a = " + a + ", b = " + b);

        // Post-decrement
        a = 15;
        b = a--;  // b = 15, then a → 14
        System.out.println("Post-decrement: a = " + a + ", b = " + b);
    }
}
