 import java.util.Scanner;

/**
 *
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in); 

    //prompt user for the size of pizza
    System.out.println("What is the size of pizza (in cm)");
    //intialize the order 
    double customerOrder = input.nextDouble();  

    
    //check to see how much it will cost 
    if(customerOrder <= 20){ 
      //let them know its gonna be a lil cute on
      System.out.println("we are going to make you a cute little pizza!"); 
      double Price1 = customerOrder * 0.50; 
      double subTotal1 = 1.74 + Price1;
      //let the customer know what the subtotal is
      System.out.println("Subtotal: " + subTotal1);
      final double tax = subTotal1 * 0.13;
      //letting them know how much taxes are going to be
      System.out.println("Taxes:" + tax);
      final double total1 = subTotal1 + tax; 
      //telling them the total amount
      System.out.println("Total:" + total1);
    }else if(customerOrder <= 40 && customerOrder >= 20.01){
      System.out.println("This will be delicious!"); 
      double Price2 = customerOrder * 0.50;
      final double subTotal2 = 1.74 + Price2;
      System.out.println("Subtotal:" + subTotal2);
      final double tax2 = subTotal2 * 0.13;
      System.out.println("Taxes:" + tax2);
      final double total2 = subTotal2 + tax2;
      System.out.println("Total:" + total2);
    }else if(customerOrder >=40){
      System.out.println("Whoa, big pizza! you might need a truck for this"); 
      double price3 = customerOrder * 0.50;
      double subTotal3 = 1.74 + price3;
      System.out.println("Subtotal:" + subTotal3); 
      final double tax3 = subTotal3 * 0.13;
      System.out.println("Taxes:" + tax3); 
      final double total3 = subTotal3 + tax3;
      System.out.println("Total:" + total3);


    }



    
  }
}
