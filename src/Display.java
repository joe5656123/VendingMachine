public class Display {
    public Item recees = new Item(1.25, "Recees"); // creates the recees item
    public Item kitkat = new Item(1.250, "Kit-Kat"); // creates the  kit-kat item
    public Item snickers = new Item(1.25, "Snickers"); // creates the snickers item
    public Item milkyway = new Item(1.25, "Milkyway"); // creates the milkyway item
    public Item herse = new Item(1.00, "Herse"); // creates the herse item
    public Item doritos = new Item(1.00, "Doritos"); // creates the doritos item
    public Item sunChips = new Item(1.00, "Sun Chips"); // creates the sun chips item
    public Item lays = new Item(1.00, "Lays"); // creates the lays item
    public Item lifeSavers = new Item(.75, "Life Savers"); // creates the life savers item
    
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