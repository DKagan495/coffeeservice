package by.kagan.coffeeservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
    @Id
    private int id;
    private String name;
    private String surname;
    private int moneyLeft;
    private int moneyPlus;

    public Seller(){

    }

    public Seller(String name, String surname, int moneyLeft, int moneyPlus) {
        this.name = name;
        this.surname = surname;
        this.moneyLeft = moneyLeft;
        this.moneyPlus = moneyPlus;
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
