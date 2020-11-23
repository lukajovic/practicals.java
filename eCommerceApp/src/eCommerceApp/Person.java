package eCommerceApp;

abstract public class Person {

    private String name;
    private String surname;
    private double budget;

    public Person(String name, String surname, double budget) {

        this.name = name;
        this.surname = surname;
        this.budget = budget;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" + "Surname: " + this.surname + "\n" + "Budget: " + this.budget;
    }

}
