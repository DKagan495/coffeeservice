package by.kagan.coffeeservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CoffeeCupQuantities {
    @Id
    private int coffeeId;
    private int littleCupQuantity;
    private int middleCupQuantity;
    private int bigCupQuantity;
    public CoffeeCupQuantities(){

    }

    public CoffeeCupQuantities(int littleCupQuantity, int middleCupQuantity, int bigCupQuantity) {
        this.littleCupQuantity = littleCupQuantity;
        this.middleCupQuantity = middleCupQuantity;
        this.bigCupQuantity = bigCupQuantity;
    }

    public int getLittleCupQuantity() {
        return littleCupQuantity;
    }

    public void setLittleCupQuantity(int littleCupQuantity) {
        this.littleCupQuantity = littleCupQuantity;
    }

    public int getMiddleCupQuantity() {
        return middleCupQuantity;
    }

    public void setMiddleCupQuantity(int middleCupQuantity) {
        this.middleCupQuantity = middleCupQuantity;
    }

    public int getBigCupQuantity() {
        return bigCupQuantity;
    }

    public void setBigCupQuantity(int bigCupQuantity) {
        this.bigCupQuantity = bigCupQuantity;
    }
}
