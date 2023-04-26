//Read the price of an item (rupees) in float and display number of paise.
import java.util.*;
class Program2_2{
  static float price;
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the price of the item");
    price=sc.nextFloat();
    System.out.println("The price of item in Paise is: "+ price*100);
  }
}