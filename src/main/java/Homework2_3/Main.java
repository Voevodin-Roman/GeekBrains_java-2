package Homework2_3;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        //Создаём коллекцию HashMap
        HashMap<String, Integer> hashMap = new HashMap<>(30);
        WordArray arrayStrings = new WordArray();
        //Пробегаем циклом по всему массиву
        for (int i = 0; i < arrayStrings.array().length; i++) {
            // метод containsKey возвращает true если значение ключа уже существует (return getNode(key) != null;).
            //Т.е. если мы помещаем значение ячейки массива в качестве ключа, а потом это слово еще раз встречается в массиве, то метод вернёт true.
            if (hashMap.containsKey(arrayStrings.array()[i])) {
                // Если слово уже есть в коллекции, мы прибавляем единицу к значению, на которое указывает этот ключ arrayStrings.array()[i]
                hashMap.put(arrayStrings.array()[i], hashMap.get(arrayStrings.array()[i]) + 1);
            } else {
                hashMap.put(arrayStrings.array()[i], 1);
            }
        }
        // В принципе вывод из HashMap и так выводит уникальные значения массива, но мне захотелось чуть красивее, без знаков "=" и лишних цифр).
        ArrayList<String> arrayList = new ArrayList<>();
        hashMap.forEach((k, v) -> {
            arrayList.add(k);
            System.out.println("Слово: " + "'" + k + "'"  + " встречается " + v + " раз(раза)");
        });
        System.out.println("Список уникальных значений массива: " + arrayList);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+11111");
        phoneBook.add("Петров", "+22222");
        phoneBook.add("Сидоров", "+11111");
        phoneBook.add("Алексеев", "+44444");
        phoneBook.add("Иванов", "+55555");
        phoneBook.add("Иванов", "+66666");
        phoneBook.get("Иванов");
    }
}
