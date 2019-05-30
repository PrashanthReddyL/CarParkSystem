import java.util.Scanner;
import java.util.ArrayList;
/**
 * This class containd  methods to Add a slot, Delete a Slot(If un-occupied), 
 * List all Slots, Park a Car , Find a Car and Remove a car from a slot.
 * All the validations for SlotID, Car Registration, Slot type and Owner name are declared in this class.
 * 
 * @author (Prashanth Reddy) 
 * @version (13/04/2019)
 */
public class ParkingSlot
{
   private CarPark slotList; //slotList is an object of CarPark class, which is created to use the methods declared in CarPark class.
   
   /**
    * Constructor for ParkingSlot Class.
    */
   public ParkingSlot() 
   {
       slotList = new CarPark(); 
   }
   
   /**
    * This method adds a new slot by taking SlotID, Slot type, Car Registration, Owner Name as inputs.
    */
   public void addSlot()
   {
       String slotID = validateSlotID(); //Slot ID
       String slotType = validateSlotType(); //Slot Type     
       String carReg = validateCarReg(); //Car Registration Number      
       String ownerName = validateOwnerName(); //Owner Name
       slotList.addSlot(new Car(slotID, slotType, carReg, ownerName));
       System.out.println("\nNew slot has been added");
   }   
   
   /**
    * This method lists all the slots present in the Arraylist in the specified format.
    */
   public void listSlots() 
   {
       ArrayList<Car> searchList = new ArrayList<Car>();//searchList is a new array list in which all the elements of main array list are stored.
       searchList = slotList.displaySlots();
       for(Car car : searchList)
          {
                System.out.println("\nList of Slots:");
                System.out.println("\n" +car.displaySlot()); // displays all the slots in the format as specified in the displaySlot() method of Car class.
          }       
   }   
   
   /**
    * This method searches for a specific car in the parking slots.
    */
   public void findCar() 
   {
       Scanner sc = new Scanner(System.in);
       String carSpot = slotList.searchReg(validateCarReg());  //carSpot stores the details of the slot if a car is found.
       if(carSpot.equals(""))
               System.out.println("\nNo Such Car Found");
       else
       {
               System.out.println("\n" +carSpot);
       }
   }    
  
   /**
    * This method takes SlotID as input and deletes the slot if it is empty.
    */
   public void deleteSlot() 
   {
        String slotID = validateSlotID(); //takes slot ID as input.
        if(slotList.deleteSlot(slotID))
            System.out.println("\nSlot has been deleted\n");
        else
            System.out.println("\nPlease check the slot number you have entered and try again...!!!!\n");
   }
    
   /**
    * This method takes SlotID, Car Registration, Owner Name and parks the car if the slot is empty. 
    */
   public void parkCar()
   {
       if(slotList.parkCar(validateSlotID(),validateCarReg(), validateOwnerName()))
            System.out.println("\nCar has been parked..!!!");
       else
            System.out.println("\nPlease check the slot number you have entered and try again...!!!!\n");
   }
   
   /**
    * This method removes a car from a specific slot ID provided by the user.
    */
   public void removeCar()  
   {
       if(slotList.removeCar(validateCarReg()))
            System.out.println("\nCar has been removed");
        else
            System.out.println("\nPlease check the registration number you have entered and try again...!!!!\n");
   }  
   
   /**
    * This method validates the SlotID entered by the user.
    */
   public String validateSlotID() 
   {
       String slotNum = null; //slotNum is a temporary variable in which the user input for SlotID is stored .
       boolean valid = false;
       Scanner sc = new Scanner(System.in);
       while(!valid)
        {
            System.out.print("Enter Slot ID:");
            slotNum = sc.nextLine();            
            if(slotNum.isEmpty() )
                System.out.println("\nError.. Slot ID cannot be Empty...!!!\n");
            else if(!slotNum.matches("[A-Z0-9]+") || slotNum.length()!= 3)
                System.out.println("\nError.. Please enter valid slot ID (ex.: D45, C34)\n");        
            else
                valid = true;
        }
       return slotNum; //after validation, the input provided by the user(if correct) is returned as slotID.
   }
    
   /**
    * This method validates the Car Registration Number entered by the user.
    */
    public String validateCarReg()
   {
       String regNum = null;//regNum is a temporary variable in which the user input for Car Registration is stored.
       boolean valid = false;
       Scanner sc = new Scanner(System.in);       
       while(!valid)
       {            
            System.out.print("Enter Car Registration:");
            regNum = sc.nextLine();            
            if(!regNum.matches("[A-Z0-9]+") || regNum.length()!=5)
                System.out.println("\nPlease enter valid registration number..(ex: D4556, G5444)\n");
            else
                valid = true;
       }
       return regNum; //after validation, the input provided by the user(if correct) is returned as car registration number.
   }    
    
   /**
    * This method validates the Owner Name entered by the user.
    */
   public String validateOwnerName()
   {
       String owName = null; //owName is a temporary variable in which the user input for Owner Name is stored.
       boolean valid = false;
       Scanner sc = new Scanner(System.in);
       while(!valid)
        {
            System.out.print("Enter Owner Name:");
            owName = sc.nextLine();            
            if(owName.isEmpty())
                System.out.println("\nError.. Owner Name cannot be empty\n");
            else if(!owName.matches("[a-zA-Z]+"))
                System.out.println("\nError.. Please enter a valid name\n");         
            else
                valid = true;
        }
        return owName; //after validation, the input provided by the user(if correct) is returned as Owner Name.
   }
   
   /**
    * This method validates the slot type entered by the user.
    */
   public String validateSlotType() 
   {
       String sType = null; //sType is a temporary variable in which the user input for Slot Type is stored.
       boolean valid = false;
       Scanner sc = new Scanner(System.in);
       while(!valid)
        {
            System.out.print("Enter Slot Type:");
            sType = sc.nextLine();            
            if(sType.isEmpty())
                System.out.println("\nError.. Slot Type cannot be empty\n");
            else if(!sType.matches("[a-zA-Z]+"))
                System.out.println("\nError.. Please enter a valid Slot Type\n");        
            else
                valid = true;
        }
        return sType; //after validation, the input provided by the user(if correct) is returned as slot type.
   }        
}
