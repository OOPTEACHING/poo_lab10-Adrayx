package semigrupa1.collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        //ArrayList<String> lista = new ArrayList<>();

        // adaugare
        lista.add("POO");
        lista.add("DB");
        lista.add(1,"AF");
        System.out.println(lista);

        // stergere
        lista.remove(2);
        System.out.println(lista);

        // modificare
        lista.set(0,"OOP");
        System.out.println(lista);

        // size-ul listei
        System.out.println("Inainte de clear " + lista.size());

        lista.clear();

        System.out.println("Dupa clear " + lista.size());

        lista.add("POO");
        lista.add("DB");
        lista.add(1,"AF");

        // parcurgere
        for(String element : lista) {
            System.out.println(element);
        }

    }

}
