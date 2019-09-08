
package Forms;

import DatabaseConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class Employee extends javax.swing.JFrame {

   
    public Employee() {
        initComponents();
        EmployeeTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Emp_Dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Emp_No = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        ShowPass = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboAddress = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ComboGender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Emp_ID = new javax.swing.JLabel();
        editLastName = new javax.swing.JLabel();
        editLastName1 = new javax.swing.JLabel();
        editLastName2 = new javax.swing.JLabel();
        editLastName3 = new javax.swing.JLabel();
        editLastName4 = new javax.swing.JLabel();
        editLastName5 = new javax.swing.JLabel();
        editLastName6 = new javax.swing.JLabel();
        editLastName7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Em_Table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        Emp_Dialog.setUndecorated(true);
        Emp_Dialog.setSize(new java.awt.Dimension(796, 548));

        jPanel1.setBackground(new java.awt.Color(18, 30, 49));

        Emp_No.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Emp_No.setForeground(new java.awt.Color(102, 0, 255));
        Emp_No.setText(". . . .");

        txtLastName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("First Name:");

        txtFirstName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Username:");

        txtUserName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

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

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Age:");

        txtAge.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.black);
        jLabel11.setText("Address");

        ComboAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ComboAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ajuy, Iloilo", "Alimodian, Iloilo", "Anilao, Iloilo", "Badiangan, Iloilo", "Balasan, Iloilo", "Banate, Iloilo", "Barotac Nuevo", "Barotac Viejo, Iloilo", "Batad, Iloilo", "Bingawan, Iloilo", "Cabatuan, Iloilo", "Calinog, Iloilo", "Carles, Iloilo", "Concepcion, Iloilo", "Dingle, Iloilo", "Dueñas, Iloilo", "Dumangas", "Estancia, Iloilo", "Guimbal, Iloilo", "Igbaras", "Template:Iloilo", "Janiuay", "Ajuy, Iloilo", "Alimodian, Iloilo", "Anilao, Iloilo", "Badiangan, Iloilo", "Balasan, Iloilo", "Banate, Iloilo", "Barotac Nuevo", "Barotac Viejo, Iloilo", "Batad, Iloilo", "Bingawan, Iloilo", "Cabatuan, Iloilo", "Calinog, Iloilo", "Carles, Iloilo", "Concepcion, Iloilo", "Dingle, Iloilo", "Dueñas, Iloilo", "Dumangas", "Estcia, Iloilo", "Guimbal, Iloilo", "Igbaras", "Template:Iloilo", "Janiuay", "Lambunao", "Leganes, Iloilo", "Lemery, Iloilo", "Leon, Iloilo", "Maasin, Iloilo", "Miagao", "Mina, Iloilo", "New Lucena", "Oton, Iloilo", "Pavia, Iloilo", "Pototan, Iloilo", "San Dionisio, Iloilo", "San Enrique, Iloilo", "San Joaquin, Iloilo", "San Miguel, Iloilo", "San Rafael, Iloilo", "Santa Barbara, Iloilo", "Sara, Iloilo", "Tigbauan", "Tubungan", "Zarraga, Iloilo" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.black);
        jLabel12.setText("Contact No:");

        txtContactNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactNoKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.black);
        jLabel13.setText("Gender");

        ComboGender.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ComboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.black);
        jLabel15.setText("Last Name :");

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.black);
        jLabel16.setText("Employe_ID :");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel17.setForeground(java.awt.Color.black);
        jLabel17.setText("Employee_No :");

        Emp_ID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Emp_ID.setForeground(new java.awt.Color(102, 0, 255));
        Emp_ID.setText(". . . .");

        editLastName.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName.setForeground(new java.awt.Color(102, 0, 204));
        editLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName.setText("Edit");
        editLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastNameMouseClicked(evt);
            }
        });

        editLastName1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName1.setForeground(new java.awt.Color(102, 0, 204));
        editLastName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName1.setText("Edit");
        editLastName1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName1MouseClicked(evt);
            }
        });

        editLastName2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName2.setForeground(new java.awt.Color(102, 0, 204));
        editLastName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName2.setText("Edit");
        editLastName2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName2MouseClicked(evt);
            }
        });

        editLastName3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName3.setForeground(new java.awt.Color(102, 0, 204));
        editLastName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName3.setText("Edit");
        editLastName3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName3MouseClicked(evt);
            }
        });

        editLastName4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName4.setForeground(new java.awt.Color(102, 0, 204));
        editLastName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName4.setText("Edit");
        editLastName4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName4MouseClicked(evt);
            }
        });

        editLastName5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName5.setForeground(new java.awt.Color(102, 0, 204));
        editLastName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName5.setText("Edit");
        editLastName5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName5MouseClicked(evt);
            }
        });

        editLastName6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName6.setForeground(new java.awt.Color(102, 0, 204));
        editLastName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName6.setText("Edit");
        editLastName6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName6MouseClicked(evt);
            }
        });

        editLastName7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        editLastName7.setForeground(new java.awt.Color(102, 0, 204));
        editLastName7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLastName7.setText("Edit");
        editLastName7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLastName7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLastName7MouseClicked(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ShowPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editLastName7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ComboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editLastName6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ComboAddress, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editLastName3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(editLastName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editLastName5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Emp_No)
                    .addComponent(Emp_ID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Emp_No))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(Emp_ID))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editLastName7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(ShowPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("x");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Emp_DialogLayout = new javax.swing.GroupLayout(Emp_Dialog.getContentPane());
        Emp_Dialog.getContentPane().setLayout(Emp_DialogLayout);
        Emp_DialogLayout.setHorizontalGroup(
            Emp_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Emp_DialogLayout.setVerticalGroup(
            Emp_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Em_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Em_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Em_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Em_TableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(Em_Table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 830, 480));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("x");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 0, 35, 29));

        search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 213, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Search :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void Em_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Em_TableMouseClicked
       int SelectedRow = Em_Table.getSelectedRow();
       TableModel md = Em_Table.getModel();
       
       String Emp_no = md.getValueAt(SelectedRow, 0).toString();
       String Emp_id = md.getValueAt(SelectedRow, 1).toString();
       String LastName = md.getValueAt(SelectedRow, 2).toString();
       String FirstName = md.getValueAt(SelectedRow, 3).toString();
       String Username = md.getValueAt(SelectedRow, 4).toString();
       String Password = md.getValueAt(SelectedRow, 5).toString();
       String Age = md.getValueAt(SelectedRow, 6).toString();
       String Address = md.getValueAt(SelectedRow,7).toString();
       String Contact = md.getValueAt(SelectedRow, 8).toString();
       String Gender1 = md.getValueAt(SelectedRow, 9).toString();
       
       Emp_Dialog.setVisible(true);
       Emp_Dialog.setLocationRelativeTo(null);
       Emp_Dialog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       
       Emp_No.setText(Emp_no);
       Emp_ID.setText(Emp_id);
       txtLastName.setText(LastName);
       txtFirstName.setText(FirstName);
       txtUserName.setText(Username);
       txtPassword.setText(Password);
       txtAge.setText(Age);
       ComboAddress.setSelectedItem(Address);
       txtContactNo.setText(Contact);
       ComboGender.setSelectedItem(Gender1);
       
       txtLastName.setEnabled(false);
       txtFirstName.setEnabled(false);
       txtUserName.setEnabled(false);
       txtPassword.setEnabled(false);
       txtAge.setEnabled(false);
       ComboAddress.setEnabled(false);
       txtContactNo.setEnabled(false);
       ComboGender.setEnabled(false);
    }//GEN-LAST:event_Em_TableMouseClicked

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

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowPassActionPerformed

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

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Emp_Dialog.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void Em_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Em_TableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Em_TableMouseEntered

    private void editLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastNameMouseClicked
        txtLastName.setEnabled(true);
    }//GEN-LAST:event_editLastNameMouseClicked

    private void editLastName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName1MouseClicked
       txtFirstName.setEnabled(true);
    }//GEN-LAST:event_editLastName1MouseClicked

    private void editLastName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName2MouseClicked
       txtUserName.setEnabled(true);
    }//GEN-LAST:event_editLastName2MouseClicked

    private void editLastName3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName3MouseClicked
       txtAge.setEnabled(true);
    }//GEN-LAST:event_editLastName3MouseClicked

    private void editLastName4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName4MouseClicked
       ComboAddress.setEnabled(true);
    }//GEN-LAST:event_editLastName4MouseClicked

    private void editLastName5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName5MouseClicked
       txtContactNo.setEnabled(true);
    }//GEN-LAST:event_editLastName5MouseClicked

    private void editLastName6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName6MouseClicked
        ComboGender.setEnabled(true);
    }//GEN-LAST:event_editLastName6MouseClicked

    private void editLastName7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLastName7MouseClicked
        txtPassword.setEnabled(true);
    }//GEN-LAST:event_editLastName7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        try
       {
          
           String update = "Update Login set Employee_ID='"+ Emp_ID.getText() +"',LastName='" + txtLastName.getText() + "',FirstName='" + txtFirstName.getText() + "',Username='" + txtUserName.getText() + "',Password='" + txtPassword.getText() + "',Age='" + txtAge.getText() + "',Address='" + ComboAddress.getSelectedIndex() + "',ContactNo='" + txtContactNo.getText() + "',Gender='" + ComboGender.getSelectedIndex() + "'where Employee_No='" + Emp_No.getText() + "'";
           PreparedStatement ps =  DBConnection.getConnection().prepareStatement(update);
           int i = ps.executeUpdate();
           if(i>0)
           {
               JOptionPane.showMessageDialog(null, "Successfuly Updated","SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
           }
           EmployeeTable();
       }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null, ex);
       }
        
       txtLastName.setText(" ");
       txtFirstName.setText(" ");
       txtUserName.setText(" ");
       txtPassword.setText(" ");
       txtAge.setText(" ");
       txtContactNo.setText(" ");
        /* _
       .__(.)< (MEOW)
        \___)   
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String Delete = "Delete from Login where Employee_No = '" + Emp_No.getText() + "'"; 
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(Delete);
            int i = ps.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(this, "Successfuly Deleted","Deleted",JOptionPane.INFORMATION_MESSAGE);
            }
            EmployeeTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        } 
       txtLastName.setText(" ");
       txtFirstName.setText(" ");
       txtUserName.setText(" ");
       txtPassword.setText("");
       txtAge.setText(" ");
       txtContactNo.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
       DefaultTableModel model = (DefaultTableModel) Em_Table.getModel();
        TableRowSorter<DefaultTableModel> row = new TableRowSorter<>(model);
        String see = search.getText();
        Em_Table.setRowSorter(row);
        row.setRowFilter(RowFilter.regexFilter(see));
    }//GEN-LAST:event_searchKeyReleased

   public void EmployeeTable() 
   {
    try
    {
        String query = "Select * from Login";
        ResultSet rs = DBConnection.getConnection().prepareStatement(query).executeQuery();
        Em_Table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(SQLException ex)
    {
        ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAddress;
    private javax.swing.JComboBox<String> ComboGender;
    private javax.swing.JTable Em_Table;
    private javax.swing.JDialog Emp_Dialog;
    public javax.swing.JLabel Emp_ID;
    public javax.swing.JLabel Emp_No;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel editLastName;
    private javax.swing.JLabel editLastName1;
    private javax.swing.JLabel editLastName2;
    private javax.swing.JLabel editLastName3;
    private javax.swing.JLabel editLastName4;
    private javax.swing.JLabel editLastName5;
    private javax.swing.JLabel editLastName6;
    private javax.swing.JLabel editLastName7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNo;
    public javax.swing.JTextField txtFirstName;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
