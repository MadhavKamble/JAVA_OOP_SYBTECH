/*Overload the method ‘findWeight()’ in your class to convert the weight given 
in ounces, pounds and tons to kilograms. Use constructor to input values.*/
import java.util.*;
class Program4_9{
  static double ounces,pounds;
  static float tons;
  static double findWeight(double ounces){
    return ounces*0.0283495;
  }
  static double findWeight(){
    return pounds*0.453592;
  }
  static float findWeight(float tons){
    return tons*1000;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the weight in ounces");
    ounces=sc.nextDouble();
    System.out.println("Enter the weight in pounds");
    pounds=sc.nextDouble();
    System.out.println("Enter the weight in tons");
    tons=sc.nextFloat();
    System.out.println("Weight in kilogram of: \n1.Ounces: "+findWeight(ounces)+"\n2.Pounds: "+findWeight()+"\n3.Tons: "+findWeight(tons));

  }
}