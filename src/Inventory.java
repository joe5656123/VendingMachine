import java.io.Serializable;
import java.util.*;

public class Inventory implements Serializable {
    private java.util.ArrayList<Item> _inventory;
    private float _cash;

    public Inventory() { }

    public java.util.ArrayList<Item> getInventory() { return this._inventory; }
    public void setInventory(java.util.List<Item> i) { this._inventory = (ArrayList<Item>) i; }

    public float getCash() { return this._cash; }
    public void setCash(float c) { this._cash = c; }

    // private void writeObject(java.io.ObjectOutputStream out) throws IOException;
    // private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException;
}
