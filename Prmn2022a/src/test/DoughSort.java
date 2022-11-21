package test;

import java.util.Comparator;

public class DoughSort implements Comparator<Dough>{
    @Override
    public int compare(Dough d1, Dough d2){
        if(d1.getMaru() < d2.getMaru()){
            return -1;
        }else if (d1.getMaru() > d2.getMaru()) {
            return 1;
        }else{
            if(d1.getZokuseiti() < d2.getZokuseiti()){
                return -1;
            }else if(d1.getZokuseiti() > d2.getZokuseiti()){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
