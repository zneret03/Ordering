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
public class InvoiceName {
    private int CustomerID;
    private int FoodID;
    private String FirstName;
    private String MiddleName;
    private String LastName;

    public InvoiceName(int CustomerID, int FoodID, String FirstName, String MiddleName, String LastName) {
        this.CustomerID = CustomerID;
        this.FoodID = FoodID;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public int getFoodID() {
        return FoodID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }
    public ArrayList invoiceList()
    {
        ArrayList<InvoiceName> array = new ArrayList<>();
        InvoiceName invoice = new InvoiceName(getCustomerID(),getFoodID(), getFirstName(), getMiddleName(), getLastName());
        array.add(invoice);
        return array;
    }
}
