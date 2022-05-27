package Homework_2_1;

public class Robot {
    private final int run;
    private final int jump;

    public Robot(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }
    public void runing(){
        System.out.println("Робот пробежал");
    }
    public void jumping(){
        System.out.println("Робот перепрыгнул");
    }
}
