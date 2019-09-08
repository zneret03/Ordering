package Forms;



import DatabaseConnection.DBConnection;
import Classes.RegisterClass;
import Forms.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    
    public Register() {
        initComponents();
        txtPassword.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        ComboAddress = new javax.swing.JComboBox<>();
        ComboGender = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ShowPass = new javax.swing.JCheckBox();
        ComboUserType = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(43, 60, 83));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("First Name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Username :");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Last Name :");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Age :");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Password :");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Contact No :");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Address :");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Gender :");

        LabelID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        LabelID.setForeground(new java.awt.Color(94, 182, 237));

        txtUserName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        txtContactNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactNoKeyPressed(evt);
            }
        });

        txtFirstName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        txtAge.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        ComboAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ComboAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ajuy, Iloilo", "Alimodian, Iloilo", "Anilao, Iloilo", "Badiangan, Iloilo", "Balasan, Iloilo", "Banate, Iloilo", "Barotac Nuevo", "Barotac Viejo, Iloilo", "Batad, Iloilo", "Bingawan, Iloilo", "Cabatuan, Iloilo", "Calinog, Iloilo", "Carles, Iloilo", "Concepcion, Iloilo", "Dingle, Iloilo", "Dueñas, Iloilo", "Dumangas", "Estancia, Iloilo", "Guimbal, Iloilo", "Igbaras", "Template:Iloilo", "Janiuay", "Ajuy, Iloilo", "Alimodian, Iloilo", "Anilao, Iloilo", "Badiangan, Iloilo", "Balasan, Iloilo", "Banate, Iloilo", "Barotac Nuevo", "Barotac Viejo, Iloilo", "Batad, Iloilo", "Bingawan, Iloilo", "Cabatuan, Iloilo", "Calinog, Iloilo", "Carles, Iloilo", "Concepcion, Iloilo", "Dingle, Iloilo", "Dueñas, Iloilo", "Dumangas", "Estcia, Iloilo", "Guimbal, Iloilo", "Igbaras", "Template:Iloilo", "Janiuay", "Lambunao", "Leganes, Iloilo", "Lemery, Iloilo", "Leon, Iloilo", "Maasin, Iloilo", "Miagao", "Mina, Iloilo", "New Lucena", "Oton, Iloilo", "Pavia, Iloilo", "Pototan, Iloilo", "San Dionisio, Iloilo", "San Enrique, Iloilo", "San Joaquin, Iloilo", "San Miguel, Iloilo", "San Rafael, Iloilo", "Santa Barbara, Iloilo", "Sara, Iloilo", "Tigbauan", "Tubungan", "Zarraga, Iloilo" }));

        ComboGender.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ComboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        btnRegister.setBackground(new java.awt.Color(255, 78, 41));
        btnRegister.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnRegister.setForeground(java.awt.Color.white);
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 149, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("_");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(27, 27, 27))
        );

        ShowPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowPassMouseClicked(evt);
            }
        });
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });

        ComboUserType.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ComboUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("User Type :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowPass)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAge)
                        .addComponent(txtContactNo)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(69, 69, 69)
                            .addComponent(jLabel13))
                        .addComponent(ComboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(LabelID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(LabelID)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10)
                        .addGap(14, 14, 14)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(ShowPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btnRegister)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int getvalue;
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked
    public void GenerateUniqueID(String Query) 
   {
       try
       {
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery(Query);
        if(rs.next())
        {
            getvalue = Integer.parseInt(rs.getString(1));
        }
       }
       catch(NumberFormatException | SQLException e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       if(txtLastName.getText().length() == 0 || txtFirstName.getText().length() == 0 || txtUserName.getText().length() == 0 || txtPassword.getText().length() == 0 || txtAge.getText().length()==0 || txtContactNo.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Do you miss something? Fill all the empty textbox","ERROR",JOptionPane.ERROR_MESSAGE);
           Login log = new Login();
           log.setVisible(true);
           log.pack();
           log.setLocationRelativeTo(null);
           log.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
           this.dispose();
       }
        else
        {
        try
        {
            GenerateUniqueID("Select count(Employee_ID)+1 from Login");
            String generate = "Employee-" + "2018-" + getvalue;
            
            
            RegisterClass RC = new RegisterClass();
            RC.setID(LabelID.getText() + generate.toString());
            RC.setLastName(txtLastName.getText());
            RC.setFirstName(txtFirstName.getText());
            RC.setUsername(txtUserName.getText());
            RC.setPassword(txtPassword.getText());
            RC.setAge(txtAge.getText());
            RC.setAddress(ComboAddress.getSelectedItem().toString());
            RC.setContactNo(txtContactNo.getText());
            RC.setGender(ComboGender.getSelectedItem().toString());
            RC.setUsertype(ComboUserType.getSelectedItem().toString());
            
            
            String query = "Insert into Login (Employee_ID,LastName,FirstName,Username,Password,Age,Address,ContactNo,Gender,Usertype) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prs = DBConnection.getConnection().prepareStatement(query);
            prs.setString(1, RC.getID());
            prs.setString(2, RC.getLastName());
            prs.setString(3, RC.getFirstName());
            prs.setString(4, RC.getUsername());
            prs.setString(5, RC.getPassword());
            prs.setString(6, RC.getAge());
            prs.setString(7, RC.getAddress());
            prs.setString(8, RC.getContactNo());
            prs.setString(9, RC.getGender());
            prs.setString(10, RC.getUsertype());
            
            
            int i = prs.executeUpdate();    
            if(i>0)
            {
                JOptionPane.showMessageDialog(null, "Register Successfully","SUCCESSFULLY",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Register Denied Please try again","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
           
        }
               txtLastName.setText(" ");
               txtFirstName.setText(" ");
               txtUserName.setText(" ");
               txtPassword.setText("");
               txtAge.setText(" ");
               txtContactNo.setText(" ");
               
       }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c))
        {
            txtAge.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter A number Only!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            txtAge.setEditable(true);
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyPressed
        char character = evt.getKeyChar();
        
        if(Character.isLetter(character))
        {
            txtContactNo.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter a Number only","ERROR!!!",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            txtContactNo.setEditable(true);
        }
    }//GEN-LAST:event_txtContactNoKeyPressed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowPassActionPerformed

    private void ShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPassMouseClicked
        
        if(ShowPass.isSelected() == true)
       {
           txtPassword.setEchoChar((char)0);
       }
        else
        {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassMouseClicked
  
 
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAddress;
    private javax.swing.JComboBox<String> ComboGender;
    private javax.swing.JComboBox<String> ComboUserType;
    private javax.swing.JLabel LabelID;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
