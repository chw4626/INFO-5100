/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author haowenchang
 */
public class Product {
    private String name;
    private String price;
    private String num;
    private String descip;
    private Supplier supplier;
    
    public Product(){
        supplier = new Supplier();
    }

    public Supplier getSupplier() {
        return supplier;
    }
    
    //Supplier sup = new Supplier();
    
    /*public String getSuppliername(){
        String supn = supplier.getSuppName();
        return supn;
    }
    
    public void setSuppliername(String supplername){
        this.supplier.setSuppName(supplername);
    }*/
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDescip() {
        return descip;
    }

    public void setDescip(String descip) {
        this.descip = descip;
    }
    
}
