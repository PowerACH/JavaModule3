public class UnitConversion {
    //Write a Java program that reads a number in inches, converts it to meters.
    //Note: One inch is 0.0254 meter.
    // Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters

    public static void inchesToMeters(int inches) {
        double meters = inches * 0.0254;
        System.out.println( inches + " inches is " + meters + " meters" + ".");
    }

    public static void main(String[] args) {
        inchesToMeters(30);
    }
}
