//Accept the value of money in rupees and convert it into dollars
import java.util.*;
class Program2_4{
  static float rupee,dollar;
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of money in Rupees");
    rupee=sc.nextFloat();
    dollar=rupee*0.012f;
    System.out.println("The valueof money in Dollar is: "+ dollar);
  }
}