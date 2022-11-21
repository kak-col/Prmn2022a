package lecture05;

public class Butterfly extends Insect{
    @Override   //書いても書かなくてもエラーは出ないし実行結果も同じだし
                //Insectにもオーバーライドしてるって表示される
                //多分省略してもいいんだと思う
    public void move(){
        System.out.println("飛んだよ");
    }


}
