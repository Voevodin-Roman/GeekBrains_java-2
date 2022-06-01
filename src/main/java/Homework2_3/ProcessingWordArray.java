package Homework2_3;

import java.util.ArrayList;
import java.util.HashMap;

public class ProcessingWordArray {
    //Создаём коллекцию HashMap
    private final HashMap<String, Integer> hashMap = new HashMap<>(30);

    public void processing(String[] arrayStrings){
        //Пробегаем циклом по всему массиву
        for (String arrayString : arrayStrings) {
            // метод containsKey возвращает true если значение ключа уже существует (return getNode(key) != null;).
            //Т.е. если мы помещаем значение ячейки массива в качестве ключа, а потом это слово еще раз встречается в массиве, то метод вернёт true.
            if (hashMap.containsKey(arrayString)) {
                // Если слово уже есть в коллекции, мы прибавляем единицу к значению, на которое указывает этот ключ arrayStrings.array()[i]
                hashMap.put(arrayString, hashMap.get(arrayString) + 1);
            } else {
                hashMap.put(arrayString, 1);
            }
        }
        // В принципе вывод из HashMap и так выводит уникальные значения массива, но мне захотелось чуть красивее, без знаков "=" и лишних цифр).
        ArrayList<String> arrayList = new ArrayList<>();
        hashMap.forEach((k, v) -> {
            arrayList.add(k);
            System.out.println("Слово: " + "'" + k + "'"  + " встречается " + v + " раз(раза)");
        });
        System.out.println("Список уникальных значений массива: " + arrayList);
    }
}
