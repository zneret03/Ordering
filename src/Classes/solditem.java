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
public class solditem {
    private String name;
    private double price;
    private double Qty;
    private double total;

    public solditem(String name, double price, double Qty, double total) {
        this.name = name;
        this.price = price;
        this.Qty = Qty;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQty() {
        return Qty;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList Listsold()
    {
        ArrayList<solditem> array = new ArrayList<>();
        solditem sold = new solditem(getName(), getPrice(), getQty(), getTotal());
        array.add(sold);
        return array;
    }
}
