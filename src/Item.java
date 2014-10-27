import java.util.*;

public class Item {
    private double _price;
    private String _name;
    
    public Item(){ // default cash register
    }
    
    public Item(double price, String name){ // default cash register
        this._price = price;
        this._name = name;
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
}