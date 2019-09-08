/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;



import Classes.invoice;
import Classes.solditem;
import DatabaseConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ian
 */
public class transaction extends javax.swing.JFrame {
    
    double Quantity, SRP, Total, gtotal, Overall,cash, Change1;;
    
    public transaction() {
        initComponents();
        initForm();
        AddrowTable();
        wipeJTableData();
       
    }
       

   private void initForm()
   {
       /*java.sql.Date date = java.sql.Date.valueOf(LocalDate.now());
       txt_date.setText(date.toString());
       */
       try
       {
          String query = "Select Distinct Name from items ";
          PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
          ResultSet rs = ps.executeQuery();
          while(rs.next())
          {
              ComboName.addItem(rs.getString("Name"));
          }
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex);
       }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Calculation = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ComboName = new javax.swing.JComboBox<>();
        Cash = new javax.swing.JTextField();
        QTY1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bttnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FoodTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txt_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_change = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Discount40 = new javax.swing.JCheckBox();
        Discount10 = new javax.swing.JCheckBox();
        Discount20 = new javax.swing.JCheckBox();
        Discount30 = new javax.swing.JCheckBox();
        Discount60 = new javax.swing.JCheckBox();
        Discount50 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Image_icon = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Database_Id_food = new javax.swing.JLabel();
        Image_c = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Calculation.setText("Calculation");
        Calculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculationActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        ComboName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ComboName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboNameMouseClicked(evt);
            }
        });
        ComboName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNameActionPerformed(evt);
            }
        });

        Cash.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Cash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        QTY1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        QTY1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QTY1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setText("Cash :");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setText("Qty :");

        bttnNew.setText("New");
        bttnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNewActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 0)));

        FoodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Qty", "Total"
            }
        ));
        jScrollPane2.setViewportView(FoodTable);

        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane1.setViewportView(Receipt);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        txt_price.setBackground(java.awt.Color.black);
        txt_price.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_price.setForeground(new java.awt.Color(204, 204, 0));
        txt_price.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_price.setText("0.00");
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setText("SRP :");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Total :");

        txt_total.setBackground(java.awt.Color.black);
        txt_total.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_total.setForeground(new java.awt.Color(204, 204, 0));
        txt_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total.setText("0.00");
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Change :");

        txt_change.setBackground(java.awt.Color.black);
        txt_change.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_change.setForeground(new java.awt.Color(204, 204, 0));
        txt_change.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_change.setText("0.00");
        txt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_changeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_change, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        Discount40.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Discount40.setText("%40");
        Discount40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Discount40MouseClicked(evt);
            }
        });

        Discount10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Discount10.setText("%10");
        Discount10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Discount10MouseClicked(evt);
            }
        });

        Discount20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Discount20.setText("%20");
        Discount20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Discount20MouseClicked(evt);
            }
        });

        Discount30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Discount30.setText("%30");
        Discount30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Discount30MouseClicked(evt);
            }
        });

        Discount60.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Discount60.setText("%60");
        Discount60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Discount60MouseClicked(evt);
            }
        });

        Discount50.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Discount50.setText("%50");
        Discount50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Discount50MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Discounts :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Discount20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discount30, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discount10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Discount60, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discount40, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discount50, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discount40)
                    .addComponent(Discount10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discount20)
                    .addComponent(Discount50))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discount30)
                    .addComponent(Discount60))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtFirstName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMiddleName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Middle Name :");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setText("ID :");

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel15.setText("First Name :");

        Image_icon.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel16.setText("Last Name :");

        Database_Id_food.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        Image_c.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel14.setText("Foods :");

        Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Date.setText("Date : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Date : ");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel17.setText("Customer ID :");

        CustomerID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QTY1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Image_c)
                            .addComponent(Image_icon)
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMiddleName)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Database_Id_food, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Date))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Calculation, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(bttnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(Database_Id_food, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QTY1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calculation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(Image_c)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Image_icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed
    public void  Id()
    {
         try
       {
           String query = "Select Id from items where Name='" + ComboName.getSelectedItem() + "'";
           PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               Database_Id_food.setText(rs.getString("Id"));
           }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }
    private void ComboNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNameActionPerformed
       try
       {
           String query = "Select Price from items where Name='" + ComboName.getSelectedItem() + "'";
           PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               txt_price.setText(rs.getString("Price"));
           }
           Id();
           
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }//GEN-LAST:event_ComboNameActionPerformed
    public void MinusQuantity() 
    {
        if(QTY1.getText().length() == 0 || txt_price.getText().length() == 0 ||
          txt_total.getText().length() == 0 || txtFirstName.getText().length() == 0 ||
          txtMiddleName.getText().length() == 0 ||  txtLastName.getText().length() == 0 || Cash.getText().length() == 0
         )
       {
           JOptionPane.showMessageDialog(null, "ERROR Please Fill all the important Details","Please try Again",JOptionPane.ERROR_MESSAGE);
       }
        else
        {
            try
            {
                
                String sql = "update items set Quantity = Quantity - ? where Id = ?";
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
                ps.setString(1, QTY1.getText());
                ps.setInt(2, Integer.parseInt(Database_Id_food.getText()));
                int i = ps.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null, "Successfuly","Success",JOptionPane.INFORMATION_MESSAGE);
                }        
 
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
          
        }
       
    }
    private void ComboNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboNameMouseClicked
      
    }//GEN-LAST:event_ComboNameMouseClicked

    private void txt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_changeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_changeActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed
    public void transaction()
    {
        try
        {
              if(Database_Id_food.getText().length() == 0 || QTY1.getText().length() == 0 || txt_price.getText().length() == 0 ||
                     txt_total.getText().length() == 0 || txtFirstName.getText().length() == 0 ||
                     txtMiddleName.getText().length() == 0 ||  txtLastName.getText().length() == 0 
                     )
                    {
                         JOptionPane.showMessageDialog(null, "ERROR Please Fill all the important Details","Please try Again",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                    Quantity = Double.parseDouble(QTY1.getText());
                    SRP = Double.parseDouble(txt_price.getText());
                    gtotal = Double.parseDouble(txt_total.getText());
                    Integer.parseInt(Database_Id_food.getText());
                    AddrowTable();
                    Calculate();
                    Receipt.setText(
                             "\t"+"Ian's Ordering ang Billing" + "\n" + "\n" +
                              "                   Brgy Bolong Ester Santa Barbara Iloilo" + "\n" +
                              "                Bachelor Of Science in Computer Science"+ "\n" +
                             "==============================================" + "\n" 
                             + "    First Name:" + "\t" + "\t"      +txtFirstName.getText() + "\n" + "\n"
                             + "    Middle Name :" + "\t"           +txtMiddleName.getText() + "\n" + "\n"
                             + "    Last Name :" + "\t" + "\t"      + txtLastName.getText() + "\n" + "\n" + "\n"
                             +"\t"+ "                   Payment" + "\n"
                             + "==============================================" + "\n"
                             + "    Order :" + "\t" + "\t"         + ComboName.getSelectedItem() + "\n" + "\n"
                             + "    Quantity :" + "\t" + "\t"      + QTY1.getText() + "\n" + "\n"           
                             + "    Cash :" + "\t" + "\t"          + Cash.getText() + "\n" + "\n"
                             + "    Price :" + "\t" + "\t"         + txt_price.getText() + "\n" + "\n"
                             + "    Total :" + "\t" + "\t"         + txt_total.getText() + "\n" + "\n" 
                             + "    Change :" + "\t" + "\t"        + txt_change.getText() + "\n" + "\n" + "\n"
                             + " . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ."
                                     + ". . . . . . . . . . . . . . . ." + "\n"
                             + "                  Thank you for Ordering Enjoy your Food" + "\n"

                     );
                    }
                    MinusQuantity();
                   
        }
        catch(java.lang.NumberFormatException ex)
        {
            
            JOptionPane.showMessageDialog(null, ex);
        }
                 
            
    }
    private void CalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculationActionPerformed
        transaction();
        int CustomerId = Integer.parseInt(Database_Id_food.getText());
        String strItem = String.valueOf(ComboName.getSelectedItem());
        try
        {
            invoice in = new invoice(
            CustomerId,
            txtFirstName.getText(),
            txtMiddleName.getText(),
            txtLastName.getText(),
            strItem,
            Quantity,
            SRP,
            gtotal,
            Date.getText()
            );
            String sql = "Insert into invoice (FoodNo,FirstName,MiddleName,LastName,Food,Quantity,Price,Total,Date) "
                    + "values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pa = DBConnection.getConnection().prepareStatement(sql);
            pa.setInt(1, in.getCustomerID());
            pa.setString(2, in.getFirst_Name());
            pa.setString(3, in.getMiddle_Name());
            pa.setString(4, in.getMiddle_Name());
            pa.setString(5,in.getFood());
            pa.setDouble(6, in.getQuantity());
            pa.setDouble(7, in.getCash());
            pa.setDouble(8,in.getTotalPurchase());
            pa.setString(9, in.getDate());
            int i = pa.executeUpdate();
            if(i>0)
            {
                //Saved into invoice Table
            }
           
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }//GEN-LAST:event_CalculationActionPerformed
   /*public void Populate()
   {
       Home m = new Home();
       PopulateComboBox pop = new PopulateComboBox(txtFirstName.getText());
       DefaultComboBoxModel model = (DefaultComboBoxModel) m.Table1.getModel();
       ArrayList<PopulateComboBox> ray = pop.getSelectedItem();
       Object row[] = new Object[3];
       for(int i = 0; i < ray.size(); i++)
       {
           row[0] = ray.get(i).getFirstname();
           JOptionPane.showMessageDialog(null, ray,"YEY",JOptionPane.INFORMATION_MESSAGE);
       }
      
   }
    */
    public void wipeJTableData()
    {
        DefaultTableModel model = (DefaultTableModel) FoodTable.getModel();
        model.setRowCount(0);
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd/HH-mm-ss").format(Calendar.getInstance().getTime());
        Date.setText(timeStamp);
    }
    private void bttnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNewActionPerformed
        
        txt_change.setText("0.00");
        txt_price.setText("0.00");
        txt_total.setText("0.00");
        /////////////////////////
        wipeJTableData();
        ////////////////////////
        ComboName.setSelectedIndex(0);
        ///////////////////////
        Cash.setText(" ");
        QTY1.setText(" ");
        txtLastName.setText(" ");
        txtMiddleName.setText(" ");
        txtFirstName.setText(" ");
        Receipt.setText(" ");
       
       
    }//GEN-LAST:event_bttnNewActionPerformed
            
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            Receipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnPrintActionPerformed

    private void Discount10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Discount10MouseClicked
       double total, overall, total1 = 0, price, change, total2 = 0;
       total = Double.parseDouble(txt_total.getText());
       price = Double.parseDouble(txt_price.getText());
       change = Double.parseDouble(txt_change.getText());
       overall = total * 0.10;
       total2 = change - overall;
       if(Discount10.isSelected() == true)
       {
           txt_change.setText(String.valueOf(total2));
           Discount10.setEnabled(false);
       }
     
     Discount20.setEnabled(false);
     Discount30.setEnabled(false);
     Discount40.setEnabled(false);
     Discount50.setEnabled(false);
     Discount60.setEnabled(false);
       
    }//GEN-LAST:event_Discount10MouseClicked

    private void Discount20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Discount20MouseClicked
       double total, overall, total1 = 0, price, change, total2 = 0;
       total = Double.parseDouble(txt_total.getText());
       price = Double.parseDouble(txt_price.getText());
       change = Double.parseDouble(txt_change.getText());
       overall = total * 0.20;
       total2 = change - overall;
       if(Discount20.isSelected() == true)
       {
           txt_change.setText(String.valueOf(total2));
           Discount20.setEnabled(false);
       }
     Discount10.setEnabled(false);
     Discount30.setEnabled(false);
     Discount40.setEnabled(false);
     Discount50.setEnabled(false);
     Discount60.setEnabled(false);
    }//GEN-LAST:event_Discount20MouseClicked

    private void Discount30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Discount30MouseClicked
       double total, overall, total1 = 0, price, change, total2 = 0;
       total = Double.parseDouble(txt_total.getText());
       price = Double.parseDouble(txt_price.getText());
       change = Double.parseDouble(txt_change.getText());
       overall = total * 0.30;
       total2 = change - overall;
       if(Discount30.isSelected() == true)
       {
           txt_change.setText(String.valueOf(total2));
           Discount30.setEnabled(false);
       }
     Discount20.setEnabled(false);
     Discount10.setEnabled(false);
     Discount40.setEnabled(false);
     Discount50.setEnabled(false);
     Discount60.setEnabled(false);
    }//GEN-LAST:event_Discount30MouseClicked

    private void Discount40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Discount40MouseClicked
       double total, overall, total1 = 0, price, change, total2 = 0;
       total = Double.parseDouble(txt_total.getText());
       price = Double.parseDouble(txt_price.getText());
       change = Double.parseDouble(txt_change.getText());
       overall = total * 0.40;
       total2 = change - overall;
       if(Discount40.isSelected() == true)
       {
           txt_change.setText(String.valueOf(total2));
           Discount40.setEnabled(false);
       }
     Discount20.setEnabled(false);
     Discount10.setEnabled(false);
     Discount30.setEnabled(false);
     Discount50.setEnabled(false);
     Discount60.setEnabled(false);
    }//GEN-LAST:event_Discount40MouseClicked

    private void Discount50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Discount50MouseClicked
       double total, overall, total1 = 0, price, change, total2 = 0;
       total = Double.parseDouble(txt_total.getText());
       price = Double.parseDouble(txt_price.getText());
       change = Double.parseDouble(txt_change.getText());
       overall = total * 0.50;
       total2 = change - overall;
       if(Discount50.isSelected() == true)
       {
           txt_change.setText(String.valueOf(total2));
           Discount50.setEnabled(false);
       }
     Discount20.setEnabled(false);
     Discount10.setEnabled(false);
     Discount30.setEnabled(false);
     Discount40.setEnabled(false);
     Discount60.setEnabled(false);
    }//GEN-LAST:event_Discount50MouseClicked

    private void Discount60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Discount60MouseClicked
        double total, overall, total1 = 0, price, change, total2 = 0;
       total = Double.parseDouble(txt_total.getText());
       price = Double.parseDouble(txt_price.getText());
       change = Double.parseDouble(txt_change.getText());
       overall = total * 0.60;
       total2 = change - overall;
       if(Discount60.isSelected() == true)
       {
           txt_change.setText(String.valueOf(total2));
           Discount60.setEnabled(false);
       }
     Discount20.setEnabled(false);
     Discount10.setEnabled(false);
     Discount30.setEnabled(false);
     Discount40.setEnabled(false);
     Discount50.setEnabled(false);
    }//GEN-LAST:event_Discount60MouseClicked
    public void AddrowTable()
    {
       double rowscount = FoodTable.getColumnCount();
       double tot , total = 0,sum = 0;
       solditem sold = new solditem(String.valueOf(ComboName.getSelectedItem()),SRP, Quantity, gtotal);
       
       DefaultTableModel model = (DefaultTableModel) FoodTable.getModel();
       ArrayList<solditem> ray = sold.Listsold();
       
       Object rows[] = new Object[5];

       if(cash < gtotal)
       {
           JOptionPane.showMessageDialog(null, "Insufficient Balance please try again","ERROR",JOptionPane.ERROR_MESSAGE);
       }
       else
       {
            for(int i = 0; i < ray.size(); i++)
            {
                rows[0] = ray.get(i).getName();
                rows[1] = ray.get(i).getPrice();
                rows[2] = ray.get(i).getQty(); 
                tot = ray.get(i).getQty() * ray.get(i).getPrice();
                total = tot + gtotal;
                rows[3] = total;
                model.addRow(rows);

            }
                txt_total.setText(String.valueOf(total));
       }
    }
   
    public void Calculate()
    {
             
            cash = Double.parseDouble(Cash.getText());
            gtotal = Double.parseDouble(txt_total.getText());
            Change1 = cash - gtotal;
            if(cash < gtotal)
            {
                
             JOptionPane.showMessageDialog(null, "Insufficient Balance please try again","ERROR",JOptionPane.ERROR_MESSAGE);
             
            }
            else
            {
                String kambyo = String.valueOf(Change1);
                txt_change.setText(kambyo);
             
            }

    }
   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Calculation;
    public javax.swing.JTextField Cash;
    public javax.swing.JComboBox<String> ComboName;
    public javax.swing.JLabel CustomerID;
    public javax.swing.JLabel Database_Id_food;
    public javax.swing.JLabel Date;
    private javax.swing.JCheckBox Discount10;
    private javax.swing.JCheckBox Discount20;
    private javax.swing.JCheckBox Discount30;
    private javax.swing.JCheckBox Discount40;
    private javax.swing.JCheckBox Discount50;
    private javax.swing.JCheckBox Discount60;
    private javax.swing.JTable FoodTable;
    private javax.swing.JLabel Image_c;
    private javax.swing.JLabel Image_icon;
    public javax.swing.JTextField QTY1;
    private javax.swing.JTextArea Receipt;
    public javax.swing.JButton btnPrint;
    public javax.swing.JButton bttnNew;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtFirstName;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtMiddleName;
    public javax.swing.JTextField txt_change;
    public javax.swing.JTextField txt_price;
    public javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
