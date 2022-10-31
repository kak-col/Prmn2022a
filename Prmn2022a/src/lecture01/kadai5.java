package lecture01;

public class kadai5 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        String s = "";
        for (int i = 0; i < score.length; i++) {
            if(score[i]<60) {
                s = "不可";
            }else if (score[i]<70){
                s = "可";
            }else if (score[i]<80){
                s = "良";
            }else if (score[i]<90){
                s = "優";
            }else if (score[i]<=100){
                s = "秀";
            }
            System.out.println(i+"番 "+score[i]+"点 "+s);
        }

        System.out.println("最高点: "+max(score)+"点");
        System.out.println("最低点 = "+min(score)+"点");
        System.out.println("平均点 = "+average(score)+"点");
    }
    static int max(int[] score){
        int max = 0;
        for (int i : score) {
            max = ( i>=max ? i : max );
        }
        return max;
    }

    static int min(int[] score){
        int min = 999;
        for (int i : score) {
            min = ( i<=min ? i : min );
        }
        return min;
    }

    static double average(int[] score){
        int sum = 0;
        for (int i : score) {
            sum += i;
        }
        return (float)sum/score.length;
    }
}
