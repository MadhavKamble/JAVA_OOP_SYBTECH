//Determine whether the entered number is palindrome or not? (A palindrome number is read same from both front and back sides such as 56365, 812218, 121 etc.)
import java.util.*;
class Program2_15{
  static int num1;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want to check");
    num1=sc.nextInt();
    palindromeCheck(num1);
  }
  public static void palindromeCheck(int num1){
    int revnum1=0;
    int num2=num1;
    while(num1>0){
      int digit=num1%10;
      revnum1=(revnum1+digit)*10;
      num1=num1/10;
    }
    revnum1=revnum1/10;
    if(revnum1==num2){
      System.out.println("Given number is a palindrome");
    }
    else{
      System.out.println("Given number is not a palindrome");
    }
  }
}