package br.com.pcv.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class itemPizza implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @ManyToMany
    private Comanda comanda;
    @ManyToMany
    private Pizza pizza;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
}