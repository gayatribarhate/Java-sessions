public class Instance {
    public static void main(String[] args) {
        String str = "Gayatri"; // new string value
        boolean result;

        // Checks if 'str' is an instance of String
        result = str instanceof String;

        System.out.println("Is str an instance of String? " + result);
    }
}
