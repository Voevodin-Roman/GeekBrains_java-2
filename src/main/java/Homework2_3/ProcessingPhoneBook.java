package Homework2_3;

import java.util.HashMap;
import java.util.Objects;

public class ProcessingPhoneBook {
    private final HashMap <String, String> hashMap = new HashMap<>();
    public void add(String surname, String phone){
            if (hashMap.containsKey(phone)){
                System.out.println("Номер " + phone + " уже есть в телефонном справочнике!");
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
