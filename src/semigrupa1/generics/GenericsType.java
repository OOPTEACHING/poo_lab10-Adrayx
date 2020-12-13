package semigrupa1.generics;

public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t=t;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Test"); //valid

        String str = type.get();
        System.out.println(str);

      /*  GenericsType<Integer> type = new GenericsType<>();
        type.set(10); //valid

        int number = type.get();
        System.out.println(number);*/
    }
}
