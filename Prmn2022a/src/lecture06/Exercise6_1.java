package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("小数点を入力してください:");
        try{
            System.out.println(input.nextDouble());
        }catch (InputMismatchException e){
            System.out.println("エラー");
        }
    }
}
