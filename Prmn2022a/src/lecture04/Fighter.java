package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.setHitPoint(enemy.getHitPoint()-this.power);
        //enemy.hitPoint -= this.power;enemyのフィールドを直接指定しても動く
        System.out.println(this.name+"は"+enemy.getName()+"に"+this.power+"ダメージを与えた、");
    }

    public boolean isAlive(){
        return hitPoint >= 0;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }
}
