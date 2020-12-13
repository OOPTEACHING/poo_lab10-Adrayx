package semigrupa1.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        // adaugare
        map.put(1,"POO");
        map.put(2,"DB");
        map.put(3,"AF");

        System.out.println(map);

        // stergere
        map.remove(1);

        System.out.println(map);

        // modificare
        map.put(3,"FA");

        System.out.println(map);

        // afisare
        System.out.println(map.get(3));
        System.out.println(map.get(0));

        for(Map.Entry<Integer,String> entry :  map.entrySet()) {

            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);

        }

    }

}
