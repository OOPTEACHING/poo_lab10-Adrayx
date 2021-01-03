package semigrupa2.pethotel;

import java.util.Random;

public class Pet {
    private String name;
    private int age;
    private String ID;
    private String ownerName;

    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
        ID = Integer.toString((new Random()).nextInt() % 10000);
        ownerName = "Unknown";
    }

    public Pet(String name, int age, String ownerName)
    {
        this.name = name;
        this.age = age;
        ID = Integer.toString((new Random()).nextInt() % 10000);
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean equals(Pet pet)
    {
        if(name.contentEquals(pet.name) && ID.contentEquals(pet.ID) && ownerName.contentEquals(pet.ownerName) && age == pet.age)
            return true;
        else
            return false;
    }
}
