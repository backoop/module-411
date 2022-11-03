package ch.fwesterath.model;

public class HumanComparator implements java.util.Comparator<Human> {
    @Override
    public int compare(Human human1, Human human2) {
        int value = human1.getCountry().compareTo(human2.getCountry());
        if (value != 0) {
            return value;
        }
        return human1.getPostalZip().compareTo(human2.getPostalZip());
    }
}
