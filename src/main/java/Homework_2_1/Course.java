package Homework_2_1;

public class Course {
    Obstacle[] obst = new Obstacle[5];

    public Course() {
        obst[0] = new Runningroad(200);
        obst[1] = new Wall(1);
        obst[2] = new Runningroad(300);
        obst[3] = new Wall(3);
        obst[4] = new Runningroad(500);
    }
    public void dolt(Team team){
          for (int i = 0; i < team.part.length ; i++){
                for (int j = 0; j < obst.length; j++) {
                    if (obst[j].type() == "Runningroad") {
                        team.part[i].run(obst[j].size());
                    } else {
                        team.part[i].jump(obst[j].size());
                    }
                    if (team.part[i].status() == false) {
                        System.out.println("Участник сошел с дистанции");
                        break;
                    }
                }
          }

    }
}
