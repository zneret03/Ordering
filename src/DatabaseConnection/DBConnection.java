/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    public static Connection getConnection() throws SQLException
    {
      try
      {
            if(conn==null)
           {
               String Connection = "jdbc:sqlite:C:\\Users\\ian\\Documents\\NetBeansProjects\\MyProject\\SQLITEPOS.sqlite";
               Class.forName("org.sqlite.JDBC");
               conn = DriverManager.getConnection(Connection);
           }
      }
      catch(ClassNotFoundException ex)
      {
            JOptionPane.showMessageDialog(null, ex);
      }
     
            return conn;
    
      }
    
   
}
