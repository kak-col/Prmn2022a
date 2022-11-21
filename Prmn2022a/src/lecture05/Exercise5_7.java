package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {
        ArrayList<Insect> list = new ArrayList<>();
        list.add(new Insect());
        list.add(new Butterfly());
        list.add(new Locust());
        list.add(new SwallowtailButterfly());
        for (Insect insect : list) {
            insect.move();
        }
    }

}
