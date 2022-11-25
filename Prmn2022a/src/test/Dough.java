package test;

public class Dough {
    private final int[] zlist = {20,8,3,15,30,5,12,7};
    //private final int[] border1 = {0,40,70,100};
    private final int[] border1 = {0,30,60,100};

    private boolean[] flag = new boolean[8];
    private int maru = 0;
    private int zokuseiti = 0;

    Dough(int flag){
        for (int i = 0; i < 8; i++) {
            if((flag&(1<<(7-i)))==(1<<(7-i))){
                this.flag[i] = true;
                maru++;
                zokuseiti += zlist[i];
            }else{
                this.flag[i] = false;
            }
        }
    }

    public String simulate(){
        int[] a = new int[8];
        String[] s = new String[8];
        for (int i = 0; i < 8; i++) {
            if(flag[i]){
                a[i] = zokuseiti - zlist[i];
                s[i] = a[i] + "-";
            }else{
                a[i] = zokuseiti + zlist[i];
                s[i] = a[i] + "+";
            }
            s[i] += "("+CalcBunrui(a[i])+")";
        }
        return chousei(s);
    }

    private String chousei(String[] s){
        String zf = "";
        for (boolean b : flag) {
            zf += (b ? "1" : "0");
        }
        String[] sput = {maru+":"+zokuseiti+"["+CalcBunrui(zokuseiti)+"]"+"  :+ ", zf+"  - "};
        for (String s1 : s) {
            //System.out.println(s1);
            if(s1.indexOf('+') != -1){
                sput[0] += s1.replace("+","") + " ";
                sput[1] += "      ";
            }else{
                sput[0] += "      ";
                sput[1] += s1.replace("-","") + " ";
            }
        }

        int sp1;
        int sp2;
        for (int i = 1; i <= 4; i++) {
            sp1 = CountString(sput[0],"("+i+")");
            if(sp1!=0){
                sp2 = CountString(sput[1],"("+i+")");
                sput[1] += "  ("+i+"):"+sp1+"/"+(sp1+sp2);
            }
        }

        return sput[0]+"\n"+sput[1]+"\n";
    }

    private int CountString(String s, String t){
        int index = 0;
        int cnt = 0;
        while(true) {
            index = s.indexOf(t, index+1);
            if (index == -1) { break; }
            cnt++;
        }
        return cnt;
    }

    private int CalcBunrui(int i){
        if(i <= border1[0]){
            return 0;
        }else if(i <= border1[1]){
            return 1;
        }else if(i <= border1[2]){
            return 2;
        }else if(i < border1[3]){
            return 3;
        }else{
            return 4;
        }
    }

    public int getMaru() {
        return maru;
    }

    public int getZokuseiti() {
        return zokuseiti;
    }
}
