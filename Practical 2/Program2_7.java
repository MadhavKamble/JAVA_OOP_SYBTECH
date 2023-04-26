// Find squares of all the numbers from 1 to n.
import java.util.*;
class Program2_7{
  static int num1;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of number until which you want to find square");
    num1=sc.nextInt();
    squareNumbers(num1);
  }
  public static void squareNumbers(int num1){
    int i;
    for(i=1;i<=num1;i++){
      System.out.print(i*i+" ");
    }
  }
}