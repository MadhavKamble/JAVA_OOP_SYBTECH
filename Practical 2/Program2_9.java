//Input a number and print it in reverse order.
import java.util.*;
class Program2_9{
  static int num1,digit,rev=0;;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num1=sc.nextInt();
    System.out.println(reverseNum(num1));
  }
  public static int reverseNum(int num1){
    while(num1>0){
      digit=num1 % 10;
      rev=rev+digit;
      rev=rev*10;
      num1=num1/10;
    }
    rev=rev/10;
    return rev;
    
  }
}
