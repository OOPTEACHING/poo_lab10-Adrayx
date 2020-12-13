package semigrupa2.comparators;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private int CNP;

    public Person(String name, int age, int CNP) {
        this.name = name;
        this.age = age;
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }

    @Override
    public int compareTo(Person person) {
        if (this.age < person.age) {
            return -1;
        } else if (this.age > person.age) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CNP=" + CNP +
                '}';
    }
}
