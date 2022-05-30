package Homework_2_1;

public class Course {
    public void addCourse(){
          Obstacle[] obst = new Obstacle[5];
          obst[0] = new Runningroad(200);
          obst[1] = new Wall(1);
          obst[2] = new Runningroad(300);
          obst[3] = new Wall(3);
          obst[4] = new Runningroad(500);

          for (int i = 0; i < Team.part.length ; i++) {
              for (int j = 0; j < obst.length ; j++) {
                  if(obst[j].type() == "Runningroad"){
                      part[i].run(obst[j].size());
                  }else {
                      part[i].jump(obst[j].size());
                  }
                  if(part[i].status() == false) {
                      System.out.println("Участник сошел с дистанции");
                      break;

    }
}
