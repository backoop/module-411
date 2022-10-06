package org.example;

public class Person {
    private String firstname;
    private String lastname;
    private double height;
    private int shoeSize;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstname, String lastname, double height, int shoeSize, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.shoeSize = shoeSize;
        this.age = age;


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                ", age=" + age +
                '}';
    }
}
