package by.kagan.coffeeservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CoffeeBuySaleQuantities {
    @Id
    private int coffeeId;
    private int quantityCompanyLeft;
    private int quantityClientPurchased;
    private int quantityCompanyPurchased;
    public CoffeeBuySaleQuantities(){

    }

    public CoffeeBuySaleQuantities(int quantityCompanyLeft, int quantityClientPurchased, int quantityCompanyPurchased) {
        this.quantityCompanyLeft = quantityCompanyLeft;
        this.quantityClientPurchased = quantityClientPurchased;
        this.quantityCompanyPurchased = quantityCompanyPurchased;
    }

    public int getQuantityCompanyLeft() {
        return quantityCompanyLeft;
    }

    public void setQuantityCompanyLeft(int quantityCompanyLeft) {
        this.quantityCompanyLeft = quantityCompanyLeft;
    }

    public int getQuantityClientPurchased() {
        return quantityClientPurchased;
    }

    public void setQuantityClientPurchased(int quantityClientPurchased) {
        this.quantityClientPurchased = quantityClientPurchased;
    }

    public int getQuantityCompanyPurchased() {
        return quantityCompanyPurchased;
    }

    public void setQuantityCompanyPurchased(int quantityCompanyPurchased) {
        this.quantityCompanyPurchased = quantityCompanyPurchased;
    }
}
