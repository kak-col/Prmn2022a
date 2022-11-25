package lecture06;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> nlist = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nlist.add(random.nextInt(6) + 1);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("さいころを5つ振りました。\n" +
                         "何番目のさいころの値を確認しますか？:");
        try{
            int index = scanner.nextInt();
            System.out.println(nlist.get(index));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました。\n" +
                               "プログラムを終了します。");
        }catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。\n" +
                               "プログラムを終了します。");
        }
    }
}
