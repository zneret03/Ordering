package Forms;



import DatabaseConnection.DBConnection;
import javax.swing.JFrame;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.Timer;






public class Home extends javax.swing.JFrame {

   
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
   public Home(String admin)
   {
       initComponents();
       welcome.setText(admin);
       jLabel15.setVisible(false);
       
         new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 LocalDateTime Dt = LocalDateTime.now();
               lbl_HR.setText(String.valueOf(Dt.getHour()));
               lbl_Min.setText(String.valueOf(Dt.getMinute()));
               lbl_mm.setText(String.valueOf(Dt.getSecond()));
               
               lbl_Month.setText(String.valueOf(Dt.getMonth()));
               lbl_day.setText(String.valueOf(Dt.getDayOfWeek()));
               jLabel9.setText(String.valueOf(Dt.getYear()));
                 EmpCount();
                 invoiceCount();
                 stocksCount();
            }
        }).start();
         
        
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Customer_Info = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Customer_ID = new javax.swing.JLabel();
        Food_No = new javax.swing.JLabel();
        First_Name = new javax.swing.JLabel();
        Middle_Name = new javax.swing.JLabel();
        Total_Purchase = new javax.swing.JLabel();
        Last_Name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_HR = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Min = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_mm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OccupiedNo3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Stocks = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Stocks2 = new javax.swing.JLabel();
        Transaction = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Stocks1 = new javax.swing.JLabel();
        Stocks3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Stocks6 = new javax.swing.JLabel();
        Stocks8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Emp = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inc = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        stocks = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_Month = new javax.swing.JLabel();
        lbl_day = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        Customer_Info.setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(18, 30, 49));

        Customer_ID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Customer_ID.setText("Customer  Id");

        Food_No.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Food_No.setText("Food No");

        First_Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        First_Name.setText("First Name");

        Middle_Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Middle_Name.setText("Middle Name");

        Total_Purchase.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Total_Purchase.setText("Total Purchase");

        Last_Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Last_Name.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("x");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Food No :");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Customer ID :");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setText("First Name :");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Last Name :");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setText("Middle Name :");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setText("Total Purchase :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(First_Name)
                    .addComponent(Food_No)
                    .addComponent(Customer_ID)
                    .addComponent(Middle_Name)
                    .addComponent(Last_Name)
                    .addComponent(Total_Purchase))
                .addGap(87, 87, 87))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer_ID)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Food_No))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(First_Name)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Middle_Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Last_Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Total_Purchase))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout Customer_InfoLayout = new javax.swing.GroupLayout(Customer_Info.getContentPane());
        Customer_Info.getContentPane().setLayout(Customer_InfoLayout);
        Customer_InfoLayout.setHorizontalGroup(
            Customer_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Customer_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Customer_InfoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Customer_InfoLayout.setVerticalGroup(
            Customer_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Customer_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Customer_InfoLayout.createSequentialGroup()
                    .addGap(0, 142, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 142, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 60, 83));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1033, 644));

        BodyPanel.setBackground(new java.awt.Color(43, 60, 83));
        BodyPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BodyPanelMouseDragged(evt);
            }
        });

        jLabelMinimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMinimize.setForeground(java.awt.Color.white);
        jLabelMinimize.setText("_");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close.setForeground(java.awt.Color.white);
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("x");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        MainPanel.setBackground(new java.awt.Color(18, 30, 49));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 92, 27));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_HR.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        lbl_HR.setForeground(java.awt.Color.white);
        lbl_HR.setText("00");
        jPanel4.add(lbl_HR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("HOUR");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbl_Min.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        lbl_Min.setForeground(java.awt.Color.white);
        lbl_Min.setText("00");
        jPanel4.add(lbl_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("MIN");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbl_mm.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        lbl_mm.setForeground(java.awt.Color.white);
        lbl_mm.setText("00");
        jPanel4.add(lbl_mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("SEC");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        MainPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 0, 70, 560));

        OccupiedNo3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OccupiedNo3.setForeground(java.awt.Color.black);
        MainPanel.add(OccupiedNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 181, -1, -1));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setForeground(java.awt.Color.white);
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
        });

        Stocks.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Stocks.setForeground(java.awt.Color.black);
        Stocks.setText("Employee");

        Employee.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo Employee.png"))); // NOI18N
        Employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("HR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Employee)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Stocks)))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Employee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stocks)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        MainPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 195, -1));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setForeground(java.awt.Color.white);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        Stocks2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Stocks2.setForeground(java.awt.Color.black);
        Stocks2.setText(" Transaction");

        Transaction.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Transaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo Transaction.png"))); // NOI18N
        Transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransactionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stocks2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Transaction))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Transaction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stocks2)
                .addGap(24, 24, 24))
        );

        MainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 195, -1));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        Stocks1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Stocks1.setForeground(java.awt.Color.black);
        Stocks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo stocks.png"))); // NOI18N
        Stocks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stocks1MouseClicked(evt);
            }
        });

        Stocks3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Stocks3.setForeground(java.awt.Color.black);
        Stocks3.setText("Stocks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Stocks1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Stocks3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(Stocks1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stocks3)
                .addGap(18, 18, 18))
        );

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 195, -1));

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        Stocks6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Stocks6.setForeground(java.awt.Color.black);
        Stocks6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Invoice.png"))); // NOI18N
        Stocks6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stocks6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stocks6MouseClicked(evt);
            }
        });

        Stocks8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Stocks8.setForeground(java.awt.Color.black);
        Stocks8.setText("Invoice");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(Stocks6)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(Stocks8)
                        .addGap(70, 70, 70))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Stocks6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stocks8)
                .addGap(22, 22, 22))
        );

        MainPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 180));

        jPanel10.setBackground(new java.awt.Color(255, 112, 105));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Emp.setBackground(java.awt.Color.white);
        Emp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Emp.setForeground(java.awt.Color.white);
        Emp.setText("...");
        jPanel10.add(Emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel16.setBackground(java.awt.Color.white);
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Employee :");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        MainPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, 40));

        jPanel11.setBackground(new java.awt.Color(45, 45, 133));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Income :");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        inc.setBackground(java.awt.Color.white);
        inc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        inc.setForeground(java.awt.Color.white);
        inc.setText("...");
        jPanel11.add(inc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        MainPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 190, 40));

        jPanel13.setBackground(new java.awt.Color(51, 51, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(java.awt.Color.white);
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Stocks :");
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        stocks.setBackground(java.awt.Color.white);
        stocks.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        stocks.setForeground(java.awt.Color.white);
        stocks.setText("...");
        jPanel13.add(stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        MainPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 190, 40));

        welcome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        welcome.setForeground(java.awt.Color.white);
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Userr.png"))); // NOI18N
        MainPanel.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        MainPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 10));

        lbl_Month.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lbl_Month.setForeground(java.awt.Color.white);
        lbl_Month.setText("00");

        lbl_day.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lbl_day.setForeground(java.awt.Color.white);
        lbl_day.setText("00");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("00");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_Month)
                .addGap(29, 29, 29)
                .addComponent(lbl_day)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Month)
                            .addComponent(lbl_day)
                            .addComponent(jLabel9)))
                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMinimize)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_CloseMouseClicked
    
    public void EmpCount()
    {
        
        try
        {
            String sql = "Select count(Employee_No) from Login"; 
            ResultSet rs = DBConnection.getConnection().prepareStatement(sql).executeQuery();
            if(rs.next())
            {
                Emp.setText(rs.getString("count(Employee_No)"));
            }
                
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void invoiceCount()
    {
        try
        {
            String sql = "Select sum(Total) from invoice";
            ResultSet rs = DBConnection.getConnection().prepareStatement(sql).executeQuery();
            if(rs.next())
            {
                inc.setText(rs.getString("sum(Total)"));
            }
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void stocksCount()
    {
        try
        {
            String sql =  "Select count(ID) from items";
            ResultSet rs =  DBConnection.getConnection().prepareStatement(sql).executeQuery();
            if(rs.next())
            {
                stocks.setText(rs.getString("count(ID)"));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void BodyPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BodyPanelMouseDragged
       
    }//GEN-LAST:event_BodyPanelMouseDragged
   
           
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Customer_Info.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        try
        {
            Stocks stock = new Stocks();
            stock.setVisible(true);
            stock.pack();
            stock.setLocationRelativeTo(null);
            stock.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "ERROR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void Stocks1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stocks1MouseClicked
        try
        {
            Stocks stock = new Stocks();
            stock.setVisible(true);
            stock.pack();
            stock.setLocationRelativeTo(null);
            stock.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "ERROR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Stocks1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        transaction trans = new transaction();
        trans.setVisible(true);
        trans.pack();
        trans.setLocationRelativeTo(null);
        trans.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }//GEN-LAST:event_jPanel2MouseClicked

    private void TransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransactionMouseClicked

    }//GEN-LAST:event_TransactionMouseClicked

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed

    }//GEN-LAST:event_jPanel3KeyPressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Employee emp = new Employee();
        emp.setVisible(true);
        emp.pack();
        emp.setLocationRelativeTo(null);
        emp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        Employee emp = new Employee();
        emp.setVisible(true);
        emp.pack();
        emp.setLocationRelativeTo(null);
        emp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_EmployeeMouseClicked

    private void Stocks6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stocks6MouseClicked
       Invoice in = new Invoice();
       in.setVisible(true);
       in.pack();
       in.setLocationRelativeTo(null);
       in.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_Stocks6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
       Invoice in = new Invoice();
       in.setVisible(true);
       in.pack();
       in.setLocationRelativeTo(null);
       in.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jPanel8MouseClicked
     
   
 
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

   
   
         
     
          
      
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel Close;
    public javax.swing.JLabel Customer_ID;
    public javax.swing.JDialog Customer_Info;
    private javax.swing.JLabel Emp;
    public javax.swing.JLabel Employee;
    public javax.swing.JLabel First_Name;
    public javax.swing.JLabel Food_No;
    public javax.swing.JLabel Last_Name;
    private javax.swing.JPanel MainPanel;
    public javax.swing.JLabel Middle_Name;
    private javax.swing.JLabel OccupiedNo3;
    private javax.swing.JLabel Stocks;
    public javax.swing.JLabel Stocks1;
    private javax.swing.JLabel Stocks2;
    private javax.swing.JLabel Stocks3;
    private javax.swing.JLabel Stocks6;
    private javax.swing.JLabel Stocks8;
    public javax.swing.JLabel Total_Purchase;
    public javax.swing.JLabel Transaction;
    private javax.swing.JLabel inc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMinimize;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbl_HR;
    private javax.swing.JLabel lbl_Min;
    private javax.swing.JLabel lbl_Month;
    private javax.swing.JLabel lbl_day;
    private javax.swing.JLabel lbl_mm;
    private javax.swing.JLabel stocks;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    private PopupMenu first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
