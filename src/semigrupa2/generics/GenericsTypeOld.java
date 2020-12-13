package semigrupa2.generics;

public class GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]){
        /*GenericsTypeOld type = new GenericsTypeOld();
        type.set("Test");

        String str = (String) type.get(); //poate cauza - ClassCastException
        System.out.println(str);
        */

        GenericsTypeOld type = new GenericsTypeOld();
        type.set(10);

        int number = (int) type.get();
        System.out.println(number);
    }
}