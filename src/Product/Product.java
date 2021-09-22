package Product;

import java.io.Serializable;

public class Product implements Serializable{
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String remark;

    public Product(int id, String name, double price, int quantity, String remark) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.remark = remark;
    }

    public Product() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
    
    
}
