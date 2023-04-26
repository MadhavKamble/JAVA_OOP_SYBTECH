//Accept a number from keyboard and find its binary equivalent
import java.util.*;
class Program2_19{
  static int num1,num2,bin=0,rem=0,power=0;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the decimal number");
    num1=sc.nextInt();
    System.out.println("The binary equivalent of "+ num1+" is "+decToBinary(num1));
  }
  public static int decToBinary(int num1){
    num2=num1;
    while(num1>0){
      rem=num1%2;
      bin=bin+(rem*(int)(Math.pow(10,power)));
      power++;
      num1=num1/2;
    }
    return bin;
  }
}