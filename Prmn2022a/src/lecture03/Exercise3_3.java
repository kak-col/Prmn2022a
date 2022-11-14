package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        String[] s = new String[2];
        int[] n = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "つ目の整数を入力してください");
            s[i] = scanner.nextLine();
            n[i] = Integer.parseInt(s[i]);
        }
        System.out.println(n[0] + " + " + n[1] + " = " + (n[0] + n[1]));;
    }
}
