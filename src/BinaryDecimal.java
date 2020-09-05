import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a positive number: ");
        number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer!");
        } else {
            System.out.print("Convert to binary is: ");
            printBinaryform(number);
        }
        System.out.println();

        String binary = "110010";
        System.out.print("Convert to decimal is: ");
        System.out.println(printDecimalform(binary));

    }

    private static int printDecimalform(String string){
        int decimalValue = Integer.parseInt(string, 2);
        return decimalValue;
    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }

}