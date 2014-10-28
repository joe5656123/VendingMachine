import java.util.*;

public class CashRegister {
    private double _amount;
    private double _userAmount;
    
    public CashRegister(){ // default cash register
        this._amount = 100.00;
        this._userAmount = 10.00;
    }
    
    public double reduce(double reducedAmount, Item item){
        this._userAmount -= reducedAmount;
        this._amount += reducedAmount;
        item.setInventory(1);
        return this._amount;
    }
    
    public void setAmount(double amount){
        this._amount = amount;
    }
    
    public double getAmount(){
        return this._amount;
    }
    
    public void setUserAmount(double userAmount){
        this._userAmount = userAmount;
    }
    
    public double getUserAmount(){
        return this._userAmount;
    }
}