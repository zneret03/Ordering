/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


/**
 *
 * @author ian
 */
public class FoodClass {
    
    private String Food_Name;
    private String Food_type;
    private double Price;
    private int Qty;


    public FoodClass(String Food_Name, String Food_type, double Price, int Qty) {
        this.Food_Name = Food_Name;
        this.Food_type = Food_type;
        this.Price = Price;
        this.Qty = Qty;

    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

   
    public String getFood_Name() {
        return Food_Name;
    }

    public void setFood_Name(String Food_Name) {
        this.Food_Name = Food_Name;
    }

    public String getFood_Type() {
        return Food_type;
    }

    public void setFood_Type(String Food_type) {
        this.Food_type = Food_type;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

  
   
    }

  

