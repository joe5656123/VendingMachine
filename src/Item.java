import java.util.*;

public class Item {
    private double _price;
    private String _name;
    private int _inventory;
    
    public Item(){ // default cash register
    }
    
    public Item(double price, String name){ // default cash register
        this._price = price;
        this._name = name;
        this._inventory = 5;
    }
    
    public void setPrice(double price){
        this._price = price;
    }
    
    public double getPrice(){
        return this._price;
    }
    
    public void setName(String name){
        this._name = name;
    }
    
    public String getName(){
        return this._name;
    }
    
    public void setInventory(int inventory){
        this._inventory -= inventory;
    }
    
    public int getInventory(){
        return this._inventory;
    }
}