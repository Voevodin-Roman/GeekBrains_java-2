package Homework_2_1;

public class Action {
    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team("Обшалдурки");
        course.dolt(team);
        team.printInfoTeam();
        team.printInfoViner();
    }
}
