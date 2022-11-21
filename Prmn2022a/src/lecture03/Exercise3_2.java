package lecture03;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        System.out.print("何行分入力しますか？");
        int l = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i < l+1; i++) {
            System.out.println(i+"行目");
            strings.add(scanner.nextLine());
        }
        System.out.println("入力した文字列:");
        for (String string : strings) {
            System.out.println("["+strings.indexOf(string)+"]"+string);
        }
    }
}
