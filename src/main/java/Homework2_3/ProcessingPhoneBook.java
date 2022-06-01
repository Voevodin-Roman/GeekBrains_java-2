package Homework2_3;

import java.util.HashMap;
import java.util.Objects;

public class ProcessingPhoneBook {
    private final HashMap <String, String> hashMap = new HashMap<>();
    public void add(String surname, String phone) throws MyPhoneAvailabilityCheckException {
        //Добавляем обработку исключения. Просто для закрепления навыка.
            if (hashMap.containsKey(phone)){
                throw new MyPhoneAvailabilityCheckException("Ошибка добавления номера — " + surname + ": " + phone + " :такой номер есть в телефонном справочнике!");
            }else{
              hashMap.put(phone, surname);
            }
    }

     public void get(String surname){
         hashMap.forEach((k, v) -> {
             if (Objects.equals(v, surname)) {
                 System.out.println(v + " : " + k);
             }
         });

     }
}
