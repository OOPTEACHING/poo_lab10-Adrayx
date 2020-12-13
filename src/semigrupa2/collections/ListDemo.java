package semigrupa2.collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        //ArrayList<String> lista = new ArrayList<>();

        // adaugare
        lista.add("Ioana");
        lista.add("Maria");
        lista.add(2,"Anca");

        // stergere
        lista.remove(1);

        // modificare
        lista.set(0,"Ioana Modificat");

        // afisare size
        System.out.println("Size curent = " + lista.size());

        // curatare
        lista.clear();

        // afisare size
        System.out.println("Size dupa clear = " + lista.size());

        lista.add("Ioana");
        lista.add("Maria");
        lista.add(2,"Anca");

        // parcurgere cu foreach
        for(String element : lista){
            System.out.println(element);
        }


    }

}
