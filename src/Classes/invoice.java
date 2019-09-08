/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class invoice {
    private int CustomerID;
    private String First_Name;
    private String Middle_Name;
    private String Last_Name;
    private String Food;
    private double quantity;
    private double cash;
    private double TotalPurchase;
    private String Date;

    public invoice(int CustomerID, String First_Name, String Middle_Name, String Last_Name, String Food, double quantity, double cash, double TotalPurchase, String Date) {
        this.CustomerID = CustomerID;
        this.First_Name = First_Name;
        this.Middle_Name = Middle_Name;
        this.Last_Name = Last_Name;
        this.Food = Food;
        this.quantity = quantity;
        this.cash = cash;
        this.TotalPurchase = TotalPurchase;
        this.Date = Date;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getFood() {
        return Food;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCash() {
        return cash;
    }

    public double getTotalPurchase() {
        return TotalPurchase;
    }

    public String getDate() {
        return Date;
    }

  
}
