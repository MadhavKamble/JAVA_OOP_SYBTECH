//Making the use of continue statement find whether the entered number is prime or not?
import java.util.*;
class Program2_13{
  static int num1,i;
  static boolean flag=true;
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    num1=sc.nextInt();
    primeCheck(num1);
  }
  public static void primeCheck(int num1){
    for(i=2;i<=Math.sqrt(num1);i++){
      if(num1%i!=0){
        continue;
      }
      else{
        flag=false;
      }
    }
    if(flag==false){
      System.out.println("Given number is not a Prime number");
    }
    else{
      System.out.println("Given number is a prime number");
    }
  }
}
