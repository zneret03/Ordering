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
public class PopulateComboBox {
    private String Firstname;

    public PopulateComboBox(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getFirstname() {
        return Firstname;
    }
    
   public ArrayList getSelectedItem()
   {
    ArrayList<PopulateComboBox> array = new ArrayList<>();
    PopulateComboBox pop = new PopulateComboBox(getFirstname());
    array.add(pop);
    return array;
    
   }
}
