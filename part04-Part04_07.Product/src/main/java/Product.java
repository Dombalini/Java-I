/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarza
 */
public class Product {
    private Double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.quantity = initialQuantity;
        this.price = initialPrice;
    }
    public void printProduct(){
        System.out.println(name + quantity + price);
    }
}
