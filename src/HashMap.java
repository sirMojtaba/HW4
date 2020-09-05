import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Character> map = new java.util.HashMap<>();
        String string = scanner.next();
        for (int i = 0; i <string.length() ; i++) {
            map.put(string.charAt(i), string.charAt(i));
            System.out.println(map);
        }
    }
}
