package semigrupa2.pethotel;

public class Record {
    private Pet dog;
    private int durationDays;

    public Record(Pet dog, int durationDays)
    {
        this.dog = dog;
        this.durationDays = durationDays;
    }

    public Pet getDog() {
        return dog;
    }

    public void setDog(Pet dog) {
        this.dog = dog;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }
}
