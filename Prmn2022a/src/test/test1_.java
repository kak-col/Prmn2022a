package test;

public class test1_ {
    int a = 20; //コンストラクタを使わずに直接宣言しても呼び出すことはできる(普通はしないらしいが...)
    test1__ t = new test1__(); //クラスも同様
//    test1_(){
//        a = 30; //コンストラクタの方が↑より優先される
//    }
}

class test1__ {
    int b = 1000;
}