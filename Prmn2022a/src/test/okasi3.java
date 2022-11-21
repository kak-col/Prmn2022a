package test;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class okasi3 {
    public static void main(String[] args) {
//        String s = "(1) (1)  )";
//        System.out.println(s.indexOf("(1)",4));
//        System.out.println(String.format("%8s", Integer.toBinaryString(15)).replace(" ", "0"));
//
        ArrayList<Dough> t = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            Dough temp = new Dough(i);
            t.add(new Dough(i));
        }
        Collections.sort(t,new DoughSort());
//        for (Dough dough : t) {
//            System.out.println(dough.simulate()+"\n");
//            System.out.println(dough.getMaru()+":"+dough.getZokuseiti());
//        }

        try{
            FileWriter filewriter = new FileWriter("okasi.txt");
            String str;
            for (Dough dough : t) {
                str = dough.simulate();
                if(str.charAt(str.indexOf('\n')+1) == '1' &&
                        str.charAt(str.indexOf('\n')+4) == '1' &&
                        //str.charAt(str.indexOf('\n')+5) == '0' &&
                        str.charAt(str.indexOf('\n')+6) == '1'){
                    //filewriter.write(str.substring(0,8)+str.substring(str.length()-17,str.length())+"\n\n");
                    filewriter.write(dough.simulate()+"\n\n");
                }
                //filewriter.write(dough.simulate()+"\n\n");
            }
            filewriter.close();
        }catch(IOException e){
            System.out.println(e);
        }
      }
}
