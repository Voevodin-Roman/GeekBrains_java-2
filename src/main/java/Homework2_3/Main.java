package Homework2_3;

public class Main {
    public static void main(String[] args) {
        ProcessingWordArray processingWordArray = new ProcessingWordArray();
        WordArray wordArray = new WordArray();
        processingWordArray.processing(wordArray.array());

        //Добавление и поиск номеров в телефонной книге");

        ProcessingPhoneBook processingPhoneBook = new ProcessingPhoneBook();
        processingPhoneBook.add("Иванов", "+11111");
        processingPhoneBook.add("Петров", "+22222");
        processingPhoneBook.add("Сидоров", "+11111");
        processingPhoneBook.add("Алексеев", "+44444");
        processingPhoneBook.add("Иванов", "+55555");
        processingPhoneBook.add("Иванов", "+66666");

        processingPhoneBook.get("Иванов");
    }
}
