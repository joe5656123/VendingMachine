
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joe56_000
 */
public class Inventory implements Serializable {
    private java.util.ArrayList<Item> _inventory;
    private int _cash;
    
    public Inventory() { }
    
    public java.util.ArrayList<Item> getInventory() { return this._inventory; }
    public void setInventory(java.util.List<Item> i) { this._inventory = (ArrayList<Item>) i; }
    
    public int getCash() { return this._cash; }
    public void setCash(int c) { this._cash = c; }
    
    // private void writeObject(java.io.ObjectOutputStream out) throws IOException;
    // private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException;
}
