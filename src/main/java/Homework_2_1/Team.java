package Homework_2_1;

public class Team {
    private String nameteam;
    public Participator[] part = new Participator[4];

    public Team(String nameteam) {
        this.nameteam = nameteam;
        part[0] = new Human(50, 2, "Дуболом");
        part[1] = new Human(100, 2, "Ломодуб");
        part[2] = new Cat(300, 1, "Рыжий");
        part[3] = new Robot(500, 10, "Шелезяка");
    }
    //Вывод информации о команде
    public void printInfoTeam(){
        System.out.println("Команда: " + nameteam + "\n" );
        for (int i = 0; i < part.length; i++) {
            System.out.println(part[i].infoName() + part[i].infoAbility());
        }
    }

    //Вывод информации о победителе
    public void printInfoViner(){
        System.out.println("Победители в команде: " + nameteam + "\n" );
        for (int i = 0; i < part.length; i++) {
            if (part[i].status()){
                System.out.println(part[i].infoName());
            }
        }
    }
}
