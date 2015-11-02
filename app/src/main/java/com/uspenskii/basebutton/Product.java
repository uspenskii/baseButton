package com.uspenskii.basebutton;

/**
 * Created by mac12841 on 5/31/2015.
 */
public class Product {
    private int id;
    private String name;
    //  private double price;

    public Product(){
        super();
    }

    public Product(int id, String name) {
        super();
        this.id = id;
        this.name = name;
        //      this.price = price;
    }

    @Override
    public String toString() {
        return this.name; // +  this.id;
    }
}