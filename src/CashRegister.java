// We did not end up using this class
public class CashRegister {
    private double _amount; // cash register amount
    private double _userAmount; // user amount

    // Creats a cash register with an initial amount of 100 and an initial user
    // amount of 10 dollars
    public CashRegister(){
        this._amount = 100.00; // initial cash register amount
        this._userAmount = 10.00; // initial user amount
    }

    // reduces the price of the item from the users pocket
    // adds the price of the item to the JVM cash register
    // reduces the amount of items in the JVM
    // returns the amount of money in the JVM cash register
    public double reduce(double reducedAmount, Item item){
        this._userAmount -= reducedAmount; // subtracts the price of the item
        this._amount += reducedAmount; // adds the price of the item
        item.setInventory(-1); // removes 1 item from that items' inventory
        return this._amount; // returns the amount of the JVM cash register
    }

    public void setAmount(double amount){ // sets the amount in the cash register
        this._amount = amount;
    }

    public double getAmount(){ // returns the amount in the cash register
        return this._amount;
    }

    public void setUserAmount(double userAmount){ // sets the amount in the users pocket
        this._userAmount = userAmount;
    }

    public double getUserAmount(){ // returns the amount in the users pocket
        return this._userAmount;
    }
}