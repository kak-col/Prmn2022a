package test;

import java.util.ArrayList;
import java.util.Collections;

public class okasi2 {
    public static void main(String[] args) {
        int[] n = {3,5,7,8,12,15,20,30};
        int t=0;
        int c=0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(1<<7);
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 8; j++) {
                if((i&(1<<j))==(1<<j)){t+=n[j];c++;};
            }
            if(/*(!list.contains(t))&&*/(c==6)&&((i&148)==148)){
                list.add(t);
            };
            t=0;c=0;
        }
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> listn = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if(!list.contains(i)) {
                listn.add(i);
            }
        }
        System.out.println(listn);
    }
}
