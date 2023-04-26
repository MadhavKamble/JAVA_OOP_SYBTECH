import java.util.*;
//Input two integer values from keyboard and swap their contents only when first number is greater, without using any other temporary variable.
class Program2_1{
  static int num1,num2;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    num1=sc.nextInt();
    System.out.println("Enter the Second number");
    num2=sc.nextInt();
    swapNum(num1, num2);
  } 
  public static void swapNum(int num1,int num2){
    if(num1>num2){
      num1=num1+num2;
      num2=num1-num2;
      num1=num1-num2;
      System.out.println("First number is "+ num1 +" and Second number is "+ num2);
    }
    else{
      System.out.println("The numbers are not swapped");
    }
  }
}