package by.kagan.coffeeservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    private int id;
    private String name;
    private String surname;
    private int age;
    private int moneyLeft;
    private int moneyPlus;

    public Client(){

    }
    public Client(int id, String name, String surname, int age, int moneyLeft, int moneyPlus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.moneyLeft = moneyLeft;
        this.moneyPlus = moneyPlus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(int moneyLeft) {
        this.moneyLeft = moneyLeft;
    }

    public int getMoneyPlus() {
        return moneyPlus;
    }

    public void setMoneyPlus(int moneyPlus) {
        this.moneyPlus = moneyPlus;
    }
}
