package semigrupa2.pethotel;

import java.util.ArrayList;

public class PetHotel{
    public ArrayList<Record> records;

    public void newRecord(Record record)
    {
        records.add(record);
    }

    public void deleteRecord(Record record)
    {
        records.remove(record);
    }
}
