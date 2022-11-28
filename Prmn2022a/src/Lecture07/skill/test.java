package Lecture07.skill;

public class test {
    public static void main(String[] args) {
        Skill[] skillset = {new Bubble(),
                     new Ember(),
                     new Peck(),
                     new RazorLeaf(),
                     new Scratch(),
                     new Tackle()};
        for (Skill skill : skillset) {
            System.out.println("スキル名:"+skill.getName());
            System.out.println("力:"+skill.getPower());
        }
    }
}
