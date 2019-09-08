/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.FoodClass;
import DatabaseConnection.DBConnection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;



public class Stocks extends javax.swing.JFrame {

    
    public Stocks() {
        initComponents();
        setDate();
        setTable();
       
    }
 
  /* public ArrayList<FoodClass> ListFood(String VarSearch)
    {
            ArrayList<FoodClass> food = new ArrayList<FoodClass>();
            try
            {
                String SearchQuery = "Select * from items Where food_name Like '%"+VarSearch+"%'";
                ResultSet rs = DBConnection.getConnection().prepareStatement(SearchQuery).executeQuery();
                
                FoodClass  foodclass = null;
                
                while(rs.next())
                {
                    foodclass = new FoodClass(
                    rs.getString("food_name"),
                    rs.getString("food_type"),
                    rs.getInt("price"),
                    rs.getInt("qty_stock")
                    );
                }
                food.add(foodclass);
                
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
                return food;    
            
    }
    
    public void SearchForFood()
    {
        ArrayList<FoodClass> food = ListFood(txt_search.getText());
        DefaultTableModel tb = new DefaultTableModel();
        Object[] row = new Object[4];
        for(int i = 0; i < food.size(); i++ )
        {
            row[0] = food.get(i).getFood_Name();
            row[1] = food.get(i).getFood_Type();
            row[2] = food.get(i).getPrice();
            row[3] = food.get(i).getQty_stock();
            tb.addRow(row);
        }
        Food_Table.setModel(tb);
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        AddStock = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Food_type = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        set_Date = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Popup = new javax.swing.JPopupMenu();
        Del = new javax.swing.JMenuItem();
        Upd = new javax.swing.JMenuItem();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Food_Table = new javax.swing.JTable();
        btn_add1 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        Print1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTextField3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTextField3.setText("jTextField1");

        AddStock.setUndecorated(true);
        AddStock.setSize(new java.awt.Dimension(380, 364));

        jPanel2.setBackground(new java.awt.Color(18, 30, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setText("Food Name : ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        f_name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 167, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("Qty :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 20));

        Qty.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setText("Food Type :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Food_type.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel3.add(Food_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 167, -1));

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 83, -1));

        set_Date.setEditable(false);
        set_Date.setBackground(new java.awt.Color(214, 217, 223));
        set_Date.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        set_Date.setBorder(null);
        set_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_DateActionPerformed(evt);
            }
        });
        jPanel3.add(set_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 167, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel14.setText("Date :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel15.setText("Food_ID :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        Id.setBackground(new java.awt.Color(51, 51, 255));
        Id.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Id.setForeground(new java.awt.Color(51, 51, 255));
        Id.setText(". . .");
        jPanel3.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 83, -1));

        price.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 40, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setText("Price : ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 300));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.red);
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("x");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 20, -1));

        javax.swing.GroupLayout AddStockLayout = new javax.swing.GroupLayout(AddStock.getContentPane());
        AddStock.getContentPane().setLayout(AddStockLayout);
        AddStockLayout.setHorizontalGroup(
            AddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AddStockLayout.setVerticalGroup(
            AddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        Del.setText("Delete");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        Popup.add(Del);

        Upd.setText("Update");
        Upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdActionPerformed(evt);
            }
        });
        Popup.add(Upd);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 35, 29));

        Food_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Food_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Food_TableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Food_TableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Food_Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 830, 500));

        btn_add1.setBackground(new java.awt.Color(255, 51, 51));
        btn_add1.setForeground(java.awt.Color.white);
        btn_add1.setText("Add");
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 22, 104, 30));

        txt_search.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 23, 225, -1));

        Print1.setBackground(new java.awt.Color(255, 51, 51));
        Print1.setForeground(java.awt.Color.white);
        Print1.setText("Print");
        Print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print1ActionPerformed(evt);
            }
        });
        getContentPane().add(Print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 22, 104, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Search :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void Food_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_TableMouseClicked
   
    }//GEN-LAST:event_Food_TableMouseClicked

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed

        /*AddStocks sd = new AddStocks();
        sd.pack();
        sd.setVisible(true);
        sd.setLocationRelativeTo(null);
        sd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.dispose();
        */
       AddStock.setVisible(true);
       AddStock.pack();
       AddStock.setLocationRelativeTo(null);
       AddStock.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       Update.setEnabled(false);
       btn_add.setEnabled(true);
        
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void Print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print1ActionPerformed
        MessageFormat header = new MessageFormat("Ian's Restaurant");
        MessageFormat Footer = new MessageFormat("Page{0,number,integer}");
        try
        {
            Food_Table.print(JTable.PrintMode.NORMAL, header, Footer);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Print1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       DefaultTableModel model = (DefaultTableModel) Food_Table.getModel();
       String search = txt_search.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Food_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_searchKeyReleased
  
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        int i;
        if(f_name.getText().length() == 0
            || Food_type.getText().length() == 0
            || Qty.getText().length() == 0 ||
            set_Date.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "ERROR PLEASE TRY AGAIN","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                    double Price = Double.parseDouble(price.getText().trim());
                    int Qty = Integer.parseInt(this.Qty.getText().trim());
                    FoodClass food = new FoodClass(
                    f_name.getText(),
                    Food_type.getText(),
                    Price,
                    Qty
                    );
                     try
                    {
                        String query = "INSERT INTO items (Name,Category,price,Date,Quantity) values (?,?,?,?,?)";
                        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
                        ps.setString(1, food.getFood_Name());
                        ps.setString(2,food.getFood_Type());
                        ps.setDouble(3, food.getPrice());
                        ps.setString(4, set_Date.getText());
                        ps.setInt(5, food.getQty());
                        i = ps.executeUpdate();
                        if(i>0)
                        {
                            JOptionPane.showMessageDialog(this, "Successfuly Added","SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);

                        }
                       
                        f_name.setText(" ");
                        Food_type.setText(" ");
                        this.Qty.setText(" ");
                        price.setText(" ");
                        
                        setTable();
                }
                catch(Exception ex)
                {
                   JOptionPane.showMessageDialog(null, ex);
                }
                finally
                {
                    
                }
              
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
           
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void set_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_set_DateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
   
        try
        {
            String update = "Update items set Name='" + f_name.getText() + 
                    "',Category='" + Food_type.getText() + 
                    "',Price='" + price.getText() + "',Date='" + set_Date.getText() + 
                    "',Quantity='" + Qty.getText() + "'where Id='" + Id.getText() +"'";
            
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(update);
            int up = ps.executeUpdate();
            if(up>0)
            {
                JOptionPane.showMessageDialog(null, "Successfuly updated","SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        setTable();
        Id.setText(" ");
        f_name.setText(" ");
        Food_type.setText(" ");
        Qty.setText(" ");
        price.setText(" ");
        AddStock.dispose();
    }//GEN-LAST:event_UpdateActionPerformed
    public void setDate()
    {
        java.sql.Date date = java.sql.Date.valueOf(LocalDate.now());
        set_Date.setText(date.toString());
    }
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        AddStock.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void Food_TableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_TableMouseReleased
        if(evt.isPopupTrigger())
        {
            Popup.show(Food_Table, evt.getX(), evt.getY());
        }

    }//GEN-LAST:event_Food_TableMouseReleased

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
    int SelectedRow = Food_Table.getSelectedRow();
    TableModel md = Food_Table.getModel();
    
    String Id1 = md.getValueAt(SelectedRow, 0 ).toString();
    String Food_name1 = md.getValueAt(SelectedRow, 1).toString();
    String Food_type1 = md.getValueAt(SelectedRow, 2).toString();
    String price1 = md.getValueAt(SelectedRow, 3).toString(); 
    String Date1 = md.getValueAt(SelectedRow, 4).toString();
    String qty_stock1 = md.getValueAt(SelectedRow, 5).toString(); 
    
    AddStock.setVisible(true);
    AddStock.setLocationRelativeTo(null);
    AddStock.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    
    Id.setText(Id1);
    f_name.setText(Food_name1);
    Food_type.setText(Food_type1);
    price.setText(price1);
    set_Date.setText(Date1);
    btn_add.setEnabled(false);
    Update.setEnabled(true);
    
    Qty.setText(qty_stock1);
    }//GEN-LAST:event_UpdActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
       DefaultTableModel model = (DefaultTableModel) Food_Table.getModel();
       int i = Food_Table.getSelectedRow();
       int SelectData;
       
       SelectData = (int) Food_Table.getValueAt(i, 0);
       
       model.removeRow(i);
       Delete(SelectData);
       
    }//GEN-LAST:event_DelActionPerformed
    public void Delete(int del)
    {
         try
        {
            String delete = "Delete from items where Id='" + del + "'";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(delete);
            int Delete = ps.executeUpdate();
            if(Delete>0)
            {
                JOptionPane.showConfirmDialog(null, "Do you want to Delete this?", "Delete", JOptionPane.YES_NO_OPTION);
            }
            Id.setText(" ");
            f_name.setText(" ");
            Food_type.setText(" ");
            Qty.setText(" ");
            price.setText(" ");

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        AddStock.dispose();
        setTable();
    }
    public void setTable()
      {
         String query = "Select * from items";
         try
         {
             ResultSet rs = DBConnection.getConnection().prepareStatement(query).executeQuery();
             Food_Table.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex);
         }
      }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddStock;
    private javax.swing.JMenuItem Del;
    public javax.swing.JTable Food_Table;
    public javax.swing.JTextField Food_type;
    public javax.swing.JLabel Id;
    private javax.swing.JPopupMenu Popup;
    private javax.swing.JButton Print1;
    public javax.swing.JTextField Qty;
    private javax.swing.JMenuItem Upd;
    public javax.swing.JButton Update;
    public javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    public javax.swing.JTextField f_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTextField price;
    public javax.swing.JTextField set_Date;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
