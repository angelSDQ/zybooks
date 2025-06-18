// Build the ItemToPurchase class with the following specifications:

// Private fields
// String itemName - Initialized in default constructor to "none"
// int itemPrice - Initialized in default constructor to 0
// int itemQuantity - Initialized in default constructor to 0
// Default constructor
// Public member methods (mutators & accessors)
// setName() & getName() (2 pts)
// setPrice() & getPrice() (2 pts)
// setQuantity() & getQuantity() (2 pts)

package javaLab;

public class ItemToPurchase {
    //Private fields - itemName, itemPrice, and itemQuanity
    
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
 
    /*Default Constructor
     itemName - Initialized to "none"
     itemPrice - Initialized to 0
     itemQuantity - Initialized ito 0
    */
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    //public member methods (mutators & accessors)
    
    //setName() & getName()
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    //setPrice() & getPrice() 
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }

    //setQuantity() & getQuantity() 
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }
    
    //print item to purchase
 
    public void printItemPurchase() {
       System.out.println(itemName + " " + itemQuantity + "@ $" + itemPrice +  
                          " = $" + (itemPrice * itemQuantity));
    }
 }

