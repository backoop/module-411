package ch.fwesterath.model;

public class PersonComparator implements java.util.Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int value = person1.getFirstName().compareTo(person2.getFirstName());
        if (value != 0) {
            return value;
        }
        return person1.getLastName().compareTo(person2.getLastName());
    }
}
