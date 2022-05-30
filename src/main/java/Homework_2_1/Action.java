package Homework_2_1;

public class Action {
    public static void main(String[] args) {
       Participator[] part = new Participator[6];
               part[0] = new Human(randomLong(), randomUp(), "Иван");
               part[1] = new Human( randomLong(), randomUp(), "Петр");
               part[2] = new Cat( randomLong(), randomUp(), "Барсик");
               part[3] = new Cat( randomLong(), randomUp(), "Пушок");
               part[4] = new Robot( randomLong(), randomUp(), "Шелезяка");
               part[5] = new Robot( randomLong(), randomUp(), "Кривовинт");
       Obstacle[] obst = new Obstacle[5];
               obst[0] = new Runningroad(randomLong());
               obst[1] = new Wall(randomUp());
               obst[2] = new Runningroad(randomLong());
               obst[3] = new Wall(randomUp());
               obst[4] = new Runningroad(randomLong());

        for (int i = 0; i < part.length ; i++) {
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
        }
    }

    private static int randomLong(){
        int randomLong = new java.util.Random().nextInt(20) + 1;
        return randomLong ;
    }
    private static int randomUp(){
        int randomUp = new java.util.Random().nextInt(3) + 1;
        return randomUp;
    }

}
