package Model;

import Product.Product;
import Service.PImplement;
import Service.PInterface;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Product p = new Product();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product id");
        p.setId(sc.nextInt());
        
        System.out.println("Enter product name");
        sc.nextLine();
        p.setName(sc.nextLine());
        
        System.out.println("Enter product price");
        p.setPrice(sc.nextDouble());
        
        System.out.println("Enter product quantity");
        p.setQuantity(sc.nextInt());
        
        System.out.println("Enter product remark");
        sc.nextLine();
        p.setRemark(sc.nextLine());
                        
        
        PInterface prod = new PImplement();
        
        prod.store(p);
    }
}
