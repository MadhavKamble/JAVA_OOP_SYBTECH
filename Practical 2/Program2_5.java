//Determine the sum of following series: 1 + 1/2 + 1/3 + …….. 1/n. take n as input
import java.util.*;
class Program2_5{
  static int num1;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms until which you want the sum ");
    num1=sc.nextInt();
    System.out.println("Sum of the series is: "+sumSeries(num1));
  }
  public static double sumSeries(int num1){
    double i, sum =0.0;
    for(i=1;i<=num1;i++){
      sum=sum+(1/i);
    }
    return sum;
  }
}