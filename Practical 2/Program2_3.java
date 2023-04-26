//Convert the Celsius temperature input from keyboard into its Fahrenheit equivalent using following formula: C = (F – 32) /1.8
import java.util.*;
class Program2_3{
  static float celcius,fahrenheit;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in Celcius");
    celcius=sc.nextFloat();
    fahrenheit=(celcius*1.8f)+32;
    System.out.println("The temperature in Fahrenhiet is: "+ fahrenheit);
  }
}