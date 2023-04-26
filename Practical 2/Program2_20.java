//Find all the natural Armstrong numbers For example: 153 is an Armstrong that is, 13 + 53 + 33 = 153
import java.util.*;
class Program2_20{
  static String num1;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num1=sc.nextLine();
    armstrongCheck(num1);
  }
  public static void armstrongCheck(String num1){
   
    int num2=Integer.parseInt(num1); 
    int num3=num2;
    int digit,sum=0;
    while(num2>0){
      digit=num2%10;
      sum=sum+(int)Math.pow(digit, num1.length());
      num2=num2/10;
    }
    if(num3==sum){
      System.out.println(num1+" is a armstrong number");
    }
    else{
      System.out.println(num1+" is not a armstrong number");
    }
  }
}