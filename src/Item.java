public class Item {
    private double _price; // price of the item
    private String _name; // name of the item
    private int _inventory; // amount of the item left in the JVM (initially 5)
    
    public Item(){ // default Item
    }
    
    public Item(double price, String name){ // creates an Item with a price, name and inventory (5 items) 
        this._price = price;
        this._name = name;
        this._inventory = 5;
    }
    
    public void setPrice(double price){ // Sets the price of the item
        this._price = price;
    }
    
    public double getPrice(){ // returns the price of the item
        return this._price;
    }
    
    public void setName(String name){ // sets the name of the item
        this._name = name;
    }
    
    public String getName(){ // returns the name of the item
        return this._name;
    }
    
    public void setInventory(int inventory){ // sets the inventory amount of the item
        this._inventory += inventory;
    }
    
    public int getInventory(){ // returns the inventory amount of the item
        return this._inventory;
    }
}