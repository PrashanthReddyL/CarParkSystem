import java.util.Scanner;
/**
 * This class handles all the inputs and outputs provided by
 * the users for the corresponding menu displayed.
 * This class contains the method to display the Main menu of the system,
 * and the startsystem method, which handles all the functionalities of the system. 
 * 
 * @author (Prashanth Reddy) 
 * @version (13/04/2019)
 */
public class Application
{
    private ParkingSlot pSlot;// pSlot is the object of ParkingSlot class.
    private CarPark cPark; // cPark is the object of CarPark class.
    
    /**
     * Constructor for Application class
     */
    public Application()
    {
        pSlot = new ParkingSlot();
        cPark = new CarPark();
    }
    
    /**
     * Method to display the main menu of the system.
     */
    private void displayMenu()
    {
        System.out.println("\nWelcome to Car Park System");
        System.out.println("=============================");
        System.out.println("(1)Add a Slot ");
        System.out.println("(2)Delete a Slot");
        System.out.println("(3)List all Slots");
        System.out.println("(4)Park a Car");
        System.out.println("(5)Find a Car ");
        System.out.println("(6)Remove a Car");
        System.out.println("(7)Exit ");
        System.out.println("\nSelect an Option: ");
    }
    
    /**
     * This method implements all the functionalities of the system.
     */
    public void startSystem() 
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            displayMenu();
            if(sc.hasNextInt())
            {
                int choice = sc.nextInt();//choice stores the value of input entered by the user. 
                switch(choice)
                {
                    case 1: pSlot.addSlot();
                            break;
                    case 2: pSlot.deleteSlot();
                            break;
                    case 3: pSlot.listSlots();
                            break;
                    case 4: pSlot.parkCar();
                            break;
                    case 5: pSlot.findCar();
                            break;
                    case 6: pSlot.removeCar();
                            break;
                    case 7: exitApplication();
                            break; 
                    default: System.out.println("\n Please choose the input from 1-7");
                }
            }
            else
            {
                System.out.println("\n Please choose the input from 1-7");
                sc.next();
            }
        }
                
    }
    
    /**
     * This method closes the application.
     */
    private void exitApplication()
    {
        System.exit(0);
    }
}
