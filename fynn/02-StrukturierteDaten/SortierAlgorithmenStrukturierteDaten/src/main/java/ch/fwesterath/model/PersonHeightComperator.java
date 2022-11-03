package ch.fwesterath.model;

public class PersonHeightComperator implements java.util.Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int returnValue;
        if (person1.getHeight() == person2.getHeight()) {
            returnValue = 0;
        } else if (person1.getHeight() > person2.getHeight()) {
            returnValue = 1;
        } else {
            returnValue = -1;
        }
        if (returnValue == 0) {
            if (person1.getAge() > person2.getAge()) {
                returnValue = 1;
            } else {
                returnValue = -1;
            }
        }
        return returnValue;
    }
}
