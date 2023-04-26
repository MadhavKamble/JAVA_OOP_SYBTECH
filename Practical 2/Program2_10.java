// Input a long number from keyboard and count total number of even digits in it.
import java.util.*;
class Program2_10{
  static long num1,digit,count=0;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    num1=sc.nextLong();
    System.out.println("Total number of even digits are: "+evenDigit(num1));
  }
  public static long evenDigit(long num1){
    while(num1!=0){
      digit=num1%10;
      if(digit%2==0){
        count++;
      }
      num1=num1/10;
    }
    return count;
  }
}