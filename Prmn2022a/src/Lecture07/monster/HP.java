package Lecture07.monster;

public class HP {
    private int hp;
    static private int dead = 0;

    boolean isArive(){
        return hp>dead;
    }

    public int getHp() {
        return hp;
    }
}
