package ch.fwesterath.model;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Integer age;
    private double height;
    private Integer showSize;

    public Person(String firstName, String lastName, double height, Integer showSize, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.showSize = showSize;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getShowSize() {
        return showSize;
    }

    public void setShowSize(Integer showSize) {
        this.showSize = showSize;
    }

    @Override
    public int compareTo(Person other) {
        if (this.age > other.getAge()) {return 1;}
        if (this.age < other.getAge()) {return -1;}
        return 0;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", height=" + height
                + ", showSize=" + showSize + "]";
    }
}

