package Homework_2_1;

public class Human {
    private final int run;
    private final int jump;

    public Human(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    public void runing(){
        System.out.println("Человек пробежал");
    }
    public void jumping(){
        System.out.println("Человек перепрыгнул");
    }
}
