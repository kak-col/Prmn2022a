public class memo {
    /*
    とほほ
    4.文法
    ・javaのcharは2バイトなので日本語もcharに入れられる
    ・文字列は==で比較できない(のでequals()を使う)
    ・(型名)でキャストできる(Cと多分同じ)

    6.修飾子
    ・アクセス修飾子
                自ファイル	                        他ファイル
                自クラス    	サブクラス	他クラス     サブクラス	他クラス
    public	    ○	        ○	        ○	        ○	        ○
    protected	○	        ○	        ○	        ○	        ×
    なし	        ○	        ○	        ○	        ×	        ×
    private	    ○	        ×	        ×	        ×	        ×

    ・static
      クラスがインスタンス化されていなくてもそのクラス、
      メソッド、変数などを参照可能であることを示す

    ・final
      上書きされないことを意味する
      変数に使うことで定数を扱える

    ・abstract
    　わかんない

    7.クラス
    ・クラス内部にクラスを定義できる(インナークラスと呼ぶ)
    ・クラスの修飾子はpublic、final、abstract、strictfp
    　を指定することができる
    　インナークラスには加えてprotected,private,static
    　を指定できる
    */

    /*
    その他
    ・switch文は矢印を使って簡潔に書ける
    ・文字列に対しても==演算子を使うことは可能
    　ただしequalsとは意味が異なり、同じ文字列でもfalseになることがある
      参考:https://www.javadrive.jp/start/string/index4.html
     */
}
