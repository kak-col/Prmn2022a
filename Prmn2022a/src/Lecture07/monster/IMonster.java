package Lecture07.monster;

public interface IMonster {
    String getName();
    int getHP();
    void derHP(int hp);
    int getPower();
    int getDefense();
    boolean isAlive();
}
