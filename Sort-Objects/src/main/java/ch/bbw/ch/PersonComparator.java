package ch.bbw.ch;

import ch.bbw.ch.model.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        //compare age
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() < o2.getAge()){
            return -1;
        }else{
            return 0;
        }
    }
}
