package javaLab;
import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
  
      // Add costs of two items and print total
      // cartTotal = item one price + item two price
      // Totoal Cost
      // item one information
      // item two information
      // Total output

      // Get item 1 details from user, create itemToPurchase object
      ItemToPurchase item1 = new ItemToPurchase();

      //item1
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      item1.setItemName(scnr.nextLine());

      System.out.println("Enter the item price: ");
      item1.setItemPrice(scnr.nextInt());

      System.out.println("Enter the item quantity: ");
      item1.setItemQuantity(scnr.nextInt());
      
      scnr.nextLine();


      // Get item 2 details from user, create itemToPurchase object
      ItemToPurchase item2 = new ItemToPurchase();

      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      item2.setItemName(scnr.nextLine());

      System.out.println("Enter the item price: ");
      item2.setItemPrice(scnr.nextInt());

      System.out.println("Enter the item quantity: ");
      item2.setItemQuantity(scnr.nextInt());

    // (2) In main(), prompt the user for two items and create two objects of the ItemToPurchase class. 
    // Before prompting for the second item, 
    // call scnr.nextLine(); to allow the user to input a new string. (2 pts)


     System.out.println("TOTAL COST");
     item1.printItemPurchase();
     item2.printItemPurchase();
     int item1Total = item1.getItemPrice() * item1.getItemQuantity();
     int item2Total = item2.getItemPrice() * item2.getItemQuantity();
     int total = item1Total + item2Total;
     System.out.println("Total: $" + total);

   }
}