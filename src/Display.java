import java.util.*;

public class Display {
    public Item recees = new Item(1.25, "Recees");
    public Item kitkat = new Item(1.250, "Kit-Kat");
    public Item snickers = new Item(1.25, "Snickers");
    public Item milkyway = new Item(1.25, "Milkyway");
    public Item herse = new Item(1.00, "Herse");
    public Item doritos = new Item(1.00, "Doritos");
    public Item sunChips = new Item(1.00, "Sun Chips");
    public Item lays = new Item(1.00, "Lays");
    public Item lifeSavers = new Item(.75, "Life Savers");
    
    public static void display(){ // creates the display of the vending machine
        System.out.println("-------------------");
        System.out.println("|  1  |  2  |  3  |");
        System.out.println("-------------------");
        System.out.println("|  4  |  5  |  6  |");
        System.out.println("-------------------");
        System.out.println("|  7  |  8  |  9  |");
        System.out.println("-------------------");
        
        System.out.println("(1) Recee's - $1.25 (2) Kit-Kat - $1.25 (3) Snickers - $1.25");
        System.out.println("(4) Milkyway - $1.25 (5) Herse - $1.00 (6) Doritos - $1.00");
        System.out.println("(7) Sun Chips - $1.00 (8) Lays - $1.00 (9) Life Savers - $0.75");
        System.out.println("Other number to exit.");
    }
}