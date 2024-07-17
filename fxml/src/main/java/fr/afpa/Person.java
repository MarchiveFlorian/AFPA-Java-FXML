package fr.afpa;

import javafx.beans.property.StringProperty;

public class Person {

    // Attributs
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty city;

    // Constructeur
    public Person(StringProperty firstName, StringProperty lastName, StringProperty city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    // Getters & Setters
    public StringProperty getFirstName() {
        return firstName;
    }

    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    public StringProperty getLastName() {
        return lastName;
    }

    public void setLastName(StringProperty lastName) {
        this.lastName = lastName;
    }

    public StringProperty getCity() {
        return city;
    }

    public void setCity(StringProperty city) {
        this.city = city;
    }

    // Méthodes
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
    }

}
