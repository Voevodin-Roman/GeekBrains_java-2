package Homework2_3;

import java.util.HashMap;
import java.util.Iterator;

public class PhoneBook {
    private HashMap <String, String> hashMap = new HashMap<>();
    public void add(String surname, String phone){
       // for (int i = 0; i < hashMap.entrySet(); i++) {
       //     if (hashMap.containsKey(phone)){
       //         System.out.println("Номер " + phone + " уже есть в телефонном справочнике!");
       //     }else{
                hashMap.put(phone, surname);
         //   }
       // }
    }

     public void get(String surname){
         hashMap.forEach((k, v) -> {
             if (v == surname) {
                 System.out.println(v + " : " + k);

             }else {
                 System.out.println("Фамилии " + surname + " нет в справочнике");
             }
         });



     }
}
