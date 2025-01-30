/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Lucas.Customer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author 20221074010012
 */
public class customerDAO {
    private Connection con;

    public customerDAO() throws SQLException {
        this.con = new ConnectionFactory().getConnection();
        System.out.println("Connection OK");
    }
    public void insertCustomer(Customer c) throws SQLException {
          String sql = "insert into customer (Store_ID, email, Address_ID, Active, first_name, last_name) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
           
            st.setInt(1, 1);
            st.setString(2, "alcemy@gmail.com");
            st.setInt(3, 10);
            st.setInt(4, 1);
            st.setString(5, "Alcemy");
            st.setString(6, "Severino");
           
            st.execute();
            String query = " select * from customer"
              + " order by customer_id desc"
              + " limit 5";
            Statement qst = con.createStatement();
            ResultSet rs = qst.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            st.close();
    }
    public void deleteCustomer(int id)throws SQLException {
          String delsql = "delete from customer where first_name = ? and last_name = ?";
            PreparedStatement dst = con.prepareStatement(delsql);
            dst.setString(1, c.getFirst_name());
            dst.setString(2, c.getLast_name());
            dst.executeUpdate();  
    }
    public void updateCustomer(int id) throws SQLException {
         String upsql = "update customer set Store_ID = ?, Address_ID = ? where first_name = ? and last_name = ?";
            PreparedStatement pst = con.prepareStatement(upsql);
            pst.setInt(1, 2);
            pst.setInt(2, 5);
            pst.setString(3, c.getFirst_name());
            pst.setString(4, c.getLast_name());
            pst.executeUpdate();
       
    }
    
    public void showCustomer()throws SQLException{
           String query = "select * from customer"
                    + " order by customer_id desc"
                    + " limit 10";

    }
     
}
