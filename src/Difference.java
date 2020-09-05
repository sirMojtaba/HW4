import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        System.out.println("Enter array numbers and at the end type *end*: ");
        while (true) {
            String number = scanner.next();
            stringList.add(number);
            if (number.equalsIgnoreCase("end")) {
                stringList.remove(stringList.size() - 1);
                break;
            }
        }
        List<Integer> integerList = new ArrayList<>();
        for (String s: stringList) {
            integerList.add(Integer.valueOf(s));
        }

        Collections.sort(integerList);
        System.out.println(integerList);
        int minDifference = integerList.get(integerList.size() - 1) - integerList.get(integerList.size() - 2);
        int maxDifference = integerList.get(integerList.size() - 1) - integerList.get(0);
        System.out.println("Minimum Difference: " + minDifference);
        System.out.println("Maximum Difference: " + maxDifference);
    }
}
