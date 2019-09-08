/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DatabaseConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author ian
 */
public class Invoice extends javax.swing.JFrame {

    
    
    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        invoiceTable();
        Total();
    }

    public void Total()
    {
        double total = 0;
        for(int i = 0; i < Invoicetable.getRowCount(); i++ )
        {
            total = total + Double.parseDouble(Invoicetable.getValueAt(i, 8).toString());
        }
        Sum.setText(String.valueOf(total));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup = new javax.swing.JPopupMenu();
        Del = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        Invoicetable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Sum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Print = new javax.swing.JButton();

        Del.setText("Delete");
        Del.setToolTipText("");
        Del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelMouseClicked(evt);
            }
        });
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        Popup.add(Del);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Invoicetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Food No", "First Name", "Middle Name", "Last Name", "Food", "Quantity", "Price", "Total", "Date"
            }
        ));
        Invoicetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoicetableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InvoicetableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Invoicetable);

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

        Sum.setBackground(java.awt.Color.black);
        Sum.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Sum.setForeground(new java.awt.Color(153, 255, 0));
        Sum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Sum.setText("0.00");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Search :");

        Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        Print.setBackground(new java.awt.Color(255, 51, 51));
        Print.setForeground(java.awt.Color.white);
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void invoiceTable()
    {
        try
        {
            Object row[] = new Object[10];
            DefaultTableModel model = (DefaultTableModel) Invoicetable.getModel();
            
            String sql = "Select * from invoice";
            
            ResultSet rs = DBConnection.getConnection().prepareStatement(sql).executeQuery();
            
            while(rs.next())
            {
                row[0] = rs.getInt("CustomerID");
                row[1] = rs.getInt("FoodNo");
                row[2] = rs.getString("FirstName");
                row[3] = rs.getString("MiddleName");
                row[4] = rs.getString("LastName");
                row[5] = rs.getString("Food");
                row[6] = rs.getString("Quantity");
                row[7] = rs.getString("Price");
                row[8] = rs.getString("Total");
                row[9] = rs.getString("Date");
                
                model.addRow(row);
                
            }
            /*String sql = "Select * from invoice";
            ResultSet rs = DBConnection.getConnection().prepareStatement(sql).executeQuery();
            Invoicetable.setModel(DbUtils.resultSetToTableModel(rs));*/
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void InvoicetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoicetableMouseClicked
     
    }//GEN-LAST:event_InvoicetableMouseClicked

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
       DefaultTableModel model = (DefaultTableModel) Invoicetable.getModel();
       String getSearch = Search.getText();
       TableRowSorter<DefaultTableModel> row = new TableRowSorter<>(model);
       Invoicetable.setRowSorter(row);
       row.setRowFilter(RowFilter.regexFilter(getSearch));
    }//GEN-LAST:event_SearchKeyReleased

    private void InvoicetableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoicetableMouseReleased

       if(evt.isPopupTrigger())
       {
           Popup.show(Invoicetable, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_InvoicetableMouseReleased
   
    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
            int SelectedData;
            DefaultTableModel model = (DefaultTableModel) Invoicetable.getModel();
            int SelectedRow = Invoicetable.getSelectedRow();
            SelectedData = (int) Invoicetable.getValueAt(SelectedRow, 0);
            model.removeRow(SelectedRow);
            RemoveData(SelectedData);
     
    }//GEN-LAST:event_DelActionPerformed
    public void RemoveData(int data)
    {
        try
        {
           String sql = "Delete from invoice where CustomerID = ?";
           PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
           ps.setInt(1, data);
           int i = ps.executeUpdate();
           if(i > 0)
           {
               JOptionPane.showMessageDialog(null, "Delete Successfuly","Delete",JOptionPane.INFORMATION_MESSAGE);
           }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void DelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelMouseClicked
       
    }//GEN-LAST:event_DelMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        
    }//GEN-LAST:event_PrintActionPerformed
   
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Del;
    private javax.swing.JTable Invoicetable;
    private javax.swing.JPopupMenu Popup;
    private javax.swing.JButton Print;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField Sum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
