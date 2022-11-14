package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
        Vegetable vegetable1 = new Vegetable("にんじん",117);
        vegetables.add(vegetable1);
        Vegetable vegetable2 = new Vegetable("じゃがいも",120);
        vegetables.add(vegetable2);
        Vegetable vegetable3 = new Vegetable("たまねぎ",154);
        vegetables.add(vegetable3);

        for (Vegetable vegetable : vegetables) {
            vegetable.print();
        }
    }
}
