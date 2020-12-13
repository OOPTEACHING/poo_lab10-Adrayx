package semigrupa2.generics;

public class GenericsMethods {

    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){

        return g1.get().equals(g2.get());
    }

    public static void main(String args[]){
        /*GenericsType<String> g1 = new GenericsType<>();
        g1.set("Test");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Test1");

        boolean isEqual = GenericsMethods.isEqual(g1, g2);

        System.out.println(isEqual);*/

        GenericsType<Integer> g1 = new GenericsType<>();
        g1.set(12);

        GenericsType<Integer> g2 = new GenericsType<>();
        g2.set(12);

        boolean isEqual = GenericsMethods.isEqual(g1, g2);

        System.out.println(isEqual);

    }
}
