/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas;
import java.sql.*;
import Lucas.Customer;
import lucas.customerDAO;
/**
 *
 * @author 20221074010066
 */

public class Lucas {

    
    public static void main(String[] args) throws SQLException {
        
    Connection con = null;
    
    Customer c = new Customer(2, "DREAMY", "BULL", "ambassingh@gmail.com", 3,1);
    
    customerDAO dao = new customerDAO();
    
    dao.insertCustomer(c);
    dao.updateCustomer(0);
    dao.deleteCustomer(0);
    dao.showCustomer();

}
}
  
           