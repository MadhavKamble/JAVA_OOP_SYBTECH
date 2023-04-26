//Print the Fibonacci series on the screen by taking n as input from keyboard: 1 1 2 3 5 8 ……. n
import java.util.*;
class Program2_6{
  static int num1;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms");
    num1=sc.nextInt();
    fibonacciSequence(num1);
  }
  public static void fibonacciSequence(int num1){
    int a=1,b=1,c=0,i;
    System.out.print("The Fibonacci sequence is: "+a+" "+b);
    for(i=0;i<=num1;i++){
      c=a+b;
      a=b;
      b=c;
      System.out.print(" "+ c);
    }
  }
}
