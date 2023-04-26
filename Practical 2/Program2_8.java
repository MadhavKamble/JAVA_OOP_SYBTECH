//Accept a number as input and find its sum of digits.
import java.util.*;
class Program2_8{
  static int num1,digit,sum=0;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num1=sc.nextInt();
    System.out.println(sumDigit(num1));
  }
  public static int sumDigit(int num1){
    while(num1>0){
      digit=num1%10;
      sum=sum+digit;
      num1=num1/10;
    }
    return sum;
  }
}