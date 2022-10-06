package ch.bbw.ch.model;

/**
 * @Author Evan
 * @Version 1.0
 * @Since 2022-06-10
 */

public class Person {
    private String firstName;
    private String lastName;
    private double height;
    private int age;
    private int shoeSize;

    public Person(String firstName, String lastName, double height, int shoeSize, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.shoeSize = shoeSize;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", shoeSize=" + shoeSize +
                '}';
    }
}
