package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter p = new Fighter(100,50,"Fighter1");
        Fighter e = new Fighter(120,50,"Fighter2");
        while(true) {
            p.attack(e);
            System.out.println(e.getName()+"の残りhitPoint:"+e.getHitPoint());
            if(e.isAlive()) {
                System.out.println(e.getName()+"は倒れた。");
                break;
            }
            e.attack(p);
            System.out.println(p.getName()+"の残りhitPoint:"+p.getHitPoint());
            if(p.isAlive()) {
                System.out.println(p.getName() + "は倒れた。");
                break;
            }
        }


    }
}
