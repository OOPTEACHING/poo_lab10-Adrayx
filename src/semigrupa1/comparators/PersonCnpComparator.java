package semigrupa1.comparators;

import java.util.Comparator;

public class PersonCnpComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getCNP() < person2.getCNP()) {
            return -1;
        } else if (person1.getCNP() > person2.getCNP()) {
            return 1;
        }
        return 0;
    }
}
