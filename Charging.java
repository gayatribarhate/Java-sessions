public class ChargingPhone {
    public static void main(String[] args) {
        int battery = 10; // Starting battery percentage

        // Simulate charging the phone until 100%
        do {
            System.out.println("Charging... Battery at " + battery + "%");
            battery += 30; // Increase battery by 30% each cycle
        } while (battery < 100);

        System.out.println("Phone is fully charged!");
    }
}
