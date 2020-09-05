import java.util.ArrayList;
import java.util.Scanner;

public class ZowjMoratab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter list size: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(i, scanner.nextInt());
        }
        convertedList(length, list);

    }
    public static void convertedList(int length, ArrayList<Integer> list){
        if (length == 0)
            System.out.println("{ }");
        else {
            if (length % 2 != 0) {
                for (int i = 0; i < list.size() - 1; i += 2) {
                    if (list.get(i) > list.get(i + 1)) {
                        list.remove(i);
                        list.remove(i);
                    }
                }
                list.remove(list.size() - 1);
            } else {
                for (int i = 0; i < list.size(); i += 2) {
                    if (list.get(i) > list.get(i + 1)) {
                        list.remove(i);
                        list.remove(i);
                    }
                }
            }
            System.out.print("{");
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size() - 1) + "}");
        }
    }
}
