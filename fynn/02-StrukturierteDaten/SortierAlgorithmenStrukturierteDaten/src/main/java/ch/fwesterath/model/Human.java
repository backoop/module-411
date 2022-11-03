package ch.fwesterath.model;

public class Human implements Comparable<Human> {
    private String name;
    private String postalZip;
    private String iban;
    private String country;

    public Human(String name, String postalZip, String iban, String country) {
        this.name = name;
        this.postalZip = postalZip;
        this.iban = iban;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public void setPostalZip(String postalZip) {
        this.postalZip = postalZip;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", postalZip='" + postalZip + '\'' +
                ", iban='" + iban + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human other) {
        int value = this.name.compareTo(other.getName());
        if (value != 0) {
            return value;
        }
        return this.postalZip.compareTo(other.getPostalZip());
    }
}
