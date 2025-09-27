//9. Convert an integer to a double and vice versa.

public class Main {
    public static void main(String[] args) {
        int intNumber = 10;
        Double doubleNumber = (double) intNumber;
        System.out.println(doubleNumber.getClass().getSimpleName());

        Integer convertedInt = doubleNumber.intValue();
        System.out.println(convertedInt.getClass().getSimpleName());
    }
}