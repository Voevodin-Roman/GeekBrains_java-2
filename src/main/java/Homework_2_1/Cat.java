package Homework_2_1;
public class Cat implements Participator {
    private final String type = "Cat";
    private final int maxRun;
    private final int maxJump;
    private final String name;

    public Cat(int maxRun, int maxJump, String name) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
    }

    @Override
    public boolean run(int run) {
        if (run >= maxRun){
            System.out.println(type + " " + name +" пробежал " + run + " Едениц");
            return true;
        }else {
            System.out.println(type + " " + name +" не пробежал " + run + " Едениц");
            return false;
        }

    }

    @Override
    public boolean jump(int jump) {
        if (jump >= maxJump){
            System.out.println(type + " " + name +" перепрыгнул стену высотой  " + jump + " Едениц");
            return true;
        }else {
            System.out.println(type + " " + name +" не перепрыгнул стену высотой  " + jump + " Едениц");
            return false;
        }

    }
}
