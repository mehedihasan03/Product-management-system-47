package Service;

import Model.DataConnection;
import Product.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PImplement implements PInterface{

    @Override
    public boolean store(Product product) {
        try {
            Connection a = DataConnection.connect();
            
            if(a==null)
                return false;
            
            String nySql = "insert into Products values(?, ?, ?, ?, ?)";
            
            PreparedStatement pre = a.prepareStatement(nySql);
            
            pre.setInt(1, product.getId());
            pre.setString(2, product.getName());
            pre.setDouble(3, product.getPrice());
            pre.setInt(4, product.getQuantity());
            pre.setString(5, product.getRemark());
            pre.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(PImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
