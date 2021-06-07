package by.kagan.coffeeservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coffee {
    @Id
    private int coffeeId;
    private String name;
    private String arabica;

    public Coffee(){

    }
    public Coffee(String name, String arabica) {
        this.name = name;
        this.arabica = arabica;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArabica() {
        return arabica;
    }

    public void setArabica(String arabica) {
        this.arabica = arabica;
    }

}
