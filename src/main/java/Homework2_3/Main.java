package Homework2_3;
// 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
// 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.


public class Main {
    public static void main(String[] args){
        ProcessingWordArray processingWordArray = new ProcessingWordArray();
        WordArray wordArray = new WordArray();
        processingWordArray.processing(wordArray.array());

        //Добавление и поиск номеров в телефонной книге");

        ProcessingPhoneBook processingPhoneBook = new ProcessingPhoneBook();
        //Добавляем обработку исключения. Просто для закрепления навыка.
        try {
            processingPhoneBook.add("Иванов", "+11111");
            processingPhoneBook.add("Петров", "+22222");
            processingPhoneBook.add("Сидоров", "+33333");
            processingPhoneBook.add("Алексеев", "+44444");
            processingPhoneBook.add("Иванов", "+55555");
            processingPhoneBook.add("Иванов", "+11111");

        }catch (MyPhoneAvailabilityCheckException e){
            e.printStackTrace();
        }
        processingPhoneBook.get("Иванов");
    }
}
