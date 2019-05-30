import java.util.Scanner;
import java.util.ArrayList;
/**
 * All the operations that are carried out on the array list are 
 * in this class. It contains methods to add a slot, delete a slot,
 * search a car, display arraylist, park a car and remove a car., 
 * 
 * @author (Prashanth Reddy) 
 * @version (13/04/2019)
 */
public class CarPark
{
    private ArrayList<Car> slotList = new ArrayList<Car>();  // slotList is an ArrayList of type Car
     
    /**
     * Method to add a new slot to the arraylist.
     */
    public void addSlot(Car car)
    {
        slotList.add(car);
    }   
    
    /**
     * Method to search a car when the user enters the registration number.
     */
    public String searchReg(String regNum)
    {        
        for (Car eachCar : slotList)
        {
            if(eachCar.getCarReg().equals(regNum))
            {
                return eachCar.displaySlot();
            }
        }
        return "";
    }   
        
    /**
     * Method to display all the slots of the array list.
     */
    public ArrayList<Car> displaySlots() 
    {
      ArrayList<Car> searchList = new ArrayList<Car>();
        for(Car eachCar : slotList)
        {            
            searchList.add(eachCar);
        }
        return searchList;
    }   
        
    /**
     * Method to delete a slot by taking slot ID as input
     */
    public boolean deleteSlot(String slotID) 
    {
        for(Car eachCar:slotList)
        {           
            if(eachCar.getSlotID().equals(slotID) && eachCar.getCarReg().matches(""))
            {
                slotList.remove(eachCar);
                return true;
            }                      
        }
        System.out.println("\nEither the Slot is occupied or No Such slot exists.");
        return false;
    }   
    
    /**
     * Method to park a car in a specified slot by taking the slotID, Registration Number and Owner Name.
     */
    public boolean parkCar(String slotID, String carReg, String ownerName) 
    {
        for(Car eachCar:slotList)
        {           
            if(eachCar.getSlotID().equals(slotID)&& eachCar.getCarReg().matches(""))
            {
                eachCar.setCarReg(carReg);
                eachCar.setOwnerName(ownerName);
                return true;
            }           
        }
        System.out.println("\nEither the Slot is Full or No such Slot found.\n");                 
        return false;
    }
    
    /**
     * Method to remove a car from a slot based on the registration number.
     */
    public boolean removeCar( String carReg) 
    {
        for(Car eachCar:slotList)
        {
            if(eachCar.getCarReg().equals(carReg))
            {
                eachCar.setCarReg("");
                eachCar.setOwnerName("");
                return true;
            }
        }
        return false;
    }   
    
    /**
     * Accessor for arraylist.
     */
    public ArrayList<Car> getSlotArrayList()
    {
        return slotList;
    }       
}
