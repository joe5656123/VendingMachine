import java.util.*;

public class Display {
    public static void display(){ // creates the display of the vending machine
        System.out.println("-------------------");
        System.out.println("|  1  |  2  |  3  |");
        System.out.println("-------------------");
        System.out.println("|  4  |  5  |  6  |");
        System.out.println("-------------------");
        System.out.println("|  7  |  8  |  9  |");
        System.out.println("-------------------");
    }
    
    public void Items(){
        Item recees = new Item(1.00, "Recees");
        Item kitkat = new Item(1.00, "Kit-Kat");
        Item snickers = new Item(1.00, "Snickers");
        Item milkyway = new Item(1.00, "Milkyway");
        Item herse = new Item(1.00, "Herse");
        Item doritos = new Item(1.00, "Doritos");
        Item sunChips = new Item(1.00, "Sun Chips");
        Item lays = new Item(1.00, "Lays");
        Item mints = new Item(.75, "Mints");
    }
}