package by.kagan.coffeeservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CoffeePrice {
    @Id
    private int coffeeId;
    private float littleCupCost;
    private float middleCupCost;
    private float bigCupCost;
    public CoffeePrice(){

    }
    public CoffeePrice(float littleCupCost, float middleCupCost, float bigCupCost){
        this.littleCupCost = littleCupCost;
        this.middleCupCost = middleCupCost;
        this.bigCupCost = bigCupCost;
    }

    public float getLittleCupCost() {
        return littleCupCost;
    }

    public void setLittleCupCost(float littleCupCost) {
        this.littleCupCost = littleCupCost;
    }

    public float getMiddleCupCost() {
        return middleCupCost;
    }

    public void setMiddleCupCost(float middleCupCost) {
        this.middleCupCost = middleCupCost;
    }

    public float getBigCupCost() {
        return bigCupCost;
    }

    public void setBigCupCost(float bigCupCost) {
        this.bigCupCost = bigCupCost;
    }
}
