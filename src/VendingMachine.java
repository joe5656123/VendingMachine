/*
 * Programmer Names: Joe, Frank, and Keith
 * Class: IST 311
 * Project: Vending Machine Project
 * Description: This program will simulate a Java Vending Machine JVM, 
 * that will allow the user to interact with the machine with GUI
 */
public class VendingMachine {
    public static void main(String[] args) {
        Item item = new Item();
        CashRegister cr = new CashRegister();
        Display d = new Display();
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        int input;
        char boolInput;
        
        Display.display();
        
        while(!exit){
            System.out.print("\nEnter the Item you want ");
            input = s.nextInt();

            switch (input){
                case 1: item = d.recees;
                break;
                case 2: item = d.kitkat;
                break;
                case 3: item = d.snickers;
                break;
                case 4: item = d.milkyway;
                break;
                case 5: item = d.herse;
                break;
                case 6: item = d.doritos;
                break;
                case 7: item = d.sunChips;
                break;
                case 8: item = d.lays;
                break;
                case 9: item = d.lifeSavers;
                break;
                default: exit = true;
            }
            
            if (exit) {}
            else {
                if (item.getPrice() - cr.getUserAmount() > 0){
                    System.out.println("You do not have enough for a " + item.getName());
                    System.out.printf("Your amount: %.2f%n", cr.getUserAmount(), " ", 
                                      item.getName()," amount: ", item.getPrice());
                }
                else{
                    if (item.getInventory() == 0)
                        System.out.print("Out of " + item.getName());
                    else{
                        cr.reduce(item.getPrice(), item);

                        System.out.printf("Vending Machine total amount changed to %.2f%n", cr.getAmount());
                        System.out.println(item.getName() + " amount changed to " + item.getInventory());
                        System.out.printf("Your total is %.2f%n", cr.getUserAmount());

                        System.out.print("\nContinue? (Y for yes, other for no) ");
                        boolInput = s.next().charAt(0);

                        switch (boolInput){
                            case 'y':
                            case 'Y':
                            break;
                            default: exit = true;
                        }
                    }
                }
            }
        }
    }
    
}

/*
run:
-------------------
|  1  |  2  |  3  |
-------------------
|  4  |  5  |  6  |
-------------------
|  7  |  8  |  9  |
-------------------
(1) Recee's - $1.25 (2) Kit-Kat - $1.25 (3) Snickers - $1.25
(4) Milkyway - $1.25 (5) Herse - $1.00 (6) Doritos - $1.00
(7) Sun Chips - $1.00 (8) Lays - $1.00 (9) Life Savers - $0.75


Enter the Item you want 1

One Recees costs 1.25
Vending Machine total amount changed to 101.25
Your total is 18.75

Continue? (Y for yes, other for no) 
y

Enter the Item you want 2

One Kit-Kat costs 1.25
Vending Machine total amount changed to 102.50
Your total is 17.50

Continue? (Y for yes, other for no) 
y

Enter the Item you want 3

One Snickers costs 1.25
Vending Machine total amount changed to 103.75
Your total is 16.25

Continue? (Y for yes, other for no) 
y

Enter the Item you want 4

One Milkyway costs 1.25
Vending Machine total amount changed to 105.00
Your total is 15.00

Continue? (Y for yes, other for no) 
y

Enter the Item you want 5

One Herse costs 1.0
Vending Machine total amount changed to 106.00
Your total is 14.00

Continue? (Y for yes, other for no) 
y

Enter the Item you want 6

One Doritos costs 1.0
Vending Machine total amount changed to 107.00
Your total is 13.00

Continue? (Y for yes, other for no) 
y

Enter the Item you want 7

One Sun Chips costs 1.0
Vending Machine total amount changed to 108.00
Your total is 12.00

Continue? (Y for yes, other for no) 
y

Enter the Item you want 8

One Lays costs 1.0
Vending Machine total amount changed to 109.00
Your total is 11.00

Continue? (Y for yes, other for no) 
y

Enter the Item you want 9

One Life Savers costs 0.75
Vending Machine total amount changed to 109.75
Your total is 10.25

Continue? (Y for yes, other for no) 
y

Enter the Item you want 1

One Recees costs 1.25
Vending Machine total amount changed to 111.00
Your total is 9.00

Continue? (Y for yes, other for no) 
n
BUILD SUCCESSFUL (total time: 1 minute 3 seconds)
*/

/*
-------------------
|  1  |  2  |  3  |
-------------------
|  4  |  5  |  6  |
-------------------
|  7  |  8  |  9  |
-------------------
(1) Recee's - $1.25 (2) Kit-Kat - $1.25 (3) Snickers - $1.25
(4) Milkyway - $1.25 (5) Herse - $1.00 (6) Doritos - $1.00
(7) Sun Chips - $1.00 (8) Lays - $1.00 (9) Life Savers - $0.75
Other number to exit.

Enter the Item you want 1
Vending Machine total amount changed to 101.25
Recees amount changed to 4
Your total is 8.75

Continue? (Y for yes, other for no) y

Enter the Item you want 1
Vending Machine total amount changed to 102.50
Recees amount changed to 3
Your total is 7.50

Continue? (Y for yes, other for no) y

Enter the Item you want 1
Vending Machine total amount changed to 103.75
Recees amount changed to 2
Your total is 6.25

Continue? (Y for yes, other for no) y

Enter the Item you want 1
Vending Machine total amount changed to 105.00
Recees amount changed to 1
Your total is 5.00

Continue? (Y for yes, other for no) y

Enter the Item you want 1
Vending Machine total amount changed to 106.25
Recees amount changed to 0
Your total is 3.75

Continue? (Y for yes, other for no) y

Enter the Item you want 1
Out of Recees
Enter the Item you want 2
Vending Machine total amount changed to 107.50
Kit-Kat amount changed to 4
Your total is 2.50

Continue? (Y for yes, other for no) y

Enter the Item you want 2
Vending Machine total amount changed to 108.75
Kit-Kat amount changed to 3
Your total is 1.25

Continue? (Y for yes, other for no) y

Enter the Item you want 2
Vending Machine total amount changed to 110.00
Kit-Kat amount changed to 2
Your total is 0.00

Continue? (Y for yes, other for no) y

Enter the Item you want 2
You do not have enough for a Kit-Kat
Your amount: 0.00

Enter the Item you want 10
*/
