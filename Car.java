/**
 * The Car class contains all the get and set methods 
 * for the variables: slotID, slotType, carReg and ownerName 
 * along with the default constructor and parameterized constructor.
 * 
 * @author (Prashanth Reddy) 
 * @version (13/04/2019)
 */
public class Car
{
    private String slotID; //Slot ID
    private String slotType; // Slot type
    private String carReg; //Car Registration Number
    private String ownerName; //Owner Name
    
    /**
     * Default Constructor for Car Class
     */
    public Car()
    {
        slotID = "";
        slotType = "";
        carReg = "";
        ownerName = "";        
    }
    
    /**
     * Parametrized constructor for Car class
     */
    public Car(String newSlotID, String newSlotType, String newCarReg, String newOwnerName) 
    {
        slotID = newSlotID;
        slotType = newSlotType;
        carReg = newCarReg;
        ownerName = newOwnerName;        
    }
    
    /**
     * String representation of a Slot in the format as:"SlotID, SlotType, ---- Car Registration, Owner Name.
     */
    public String displaySlot() 
    {
        return slotID + ", Slot Type:" +
               slotType + " -----  Car Registration No.:" +
               carReg + ",   Owner:" +
               ownerName;
    }
    
    /**
     * Accessor for SlotID
     */
    public String getSlotID() 
    {
        return slotID;
    }
    
    /**
     * Mutator for SlotID
     */
    public void setSlotID(String newSlotID) 
    {
        slotID = newSlotID;
    }
    
    /**
     * Accessor for Slot Type
     */
    public String getSlotType() 
    {
        return slotType;
    }    
    
    /**
     * Mutator for Slot Type
     */
    public void setSlotType(String newSlotType) 
    {
        newSlotType = newSlotType;
    }
    
    /**
     * Accessor for Car Registration Number
     */
    public String getCarReg() 
    {
        return carReg;
    }
    
    /**
     * Mutator for Car Registration Number
     */
    public void setCarReg(String newCarReg) 
    {
        carReg = newCarReg;
    }
    
    /**
     * Accessor for Owner Name
     */
    public String getOwnerName() 
    {
        return ownerName;
    }
    
    /**
     * Mutator for Owner Name
     */
    public void setOwnerName(String newOwnerName) 
    {
        ownerName = newOwnerName;
    }
}