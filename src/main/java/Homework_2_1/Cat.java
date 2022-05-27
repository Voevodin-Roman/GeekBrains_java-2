package Homework_2_1;

public class Cat {
    private final int run;
    private final int jump;

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }
    public void runing(){
        System.out.println("Кот пробежал");
    }
    public void jumping(){
        System.out.println("Кот перепрыгнул");
    }
}
