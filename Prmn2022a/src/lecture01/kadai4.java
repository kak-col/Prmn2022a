package lecture01;

public class kadai4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = i+1;
            sum += ( array[i]%2 == 0 ? array[i]: 0);
        }
        System.out.println("sum = "+sum);
    }
}
