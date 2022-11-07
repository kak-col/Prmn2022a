package lecture02;

public class Human {
    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        String s = "";
        if(age<=18){
            s = "生徒:";
        }else if(age<=22){
            s = "学生:";
        }
        System.out.println(s+name+" "+age+"歳です。");
    }
}
