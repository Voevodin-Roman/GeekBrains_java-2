package Homework_2_1;
public class Cat implements Participator {
    private final String type = "Cat";
    private final int maxRun;
    private final int maxJump;
    private final String name;
    private boolean status;

    public Cat(int maxRun, int maxJump, String name) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
    }

    @Override
    public void run(int run) {
        if (run >= maxRun){
            System.out.println(type + " " + name +" пробежал " + run + " Едениц");
            status = true;
        }else {
            System.out.println(type + " " + name +" не пробежал " + run + " Едениц");
            status = false;
        }
    }

    @Override
    public void jump(int jump) {
        if (jump >= maxJump){
            System.out.println(type + " " + name +" перепрыгнул стену высотой  " + jump + " Едениц");
            status = true;
        }else {
            System.out.println(type + " " + name +" не перепрыгнул стену высотой  " + jump + " Едениц");
            status = false;
        }
    }
    @Override
    public boolean status() {
        return status;
    }
    @Override
    public String infoAbility() {
        return "Максимальное расстояние бега " + maxRun + "\n" + "Максимальная высота прыга" + maxJump;
    }

    @Override
    public String infoName() {
        return type + " " + name + "\n";
    }
}
