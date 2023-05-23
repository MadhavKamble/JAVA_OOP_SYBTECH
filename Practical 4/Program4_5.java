/*Define a class ‘Salary’ which will contain data members basic, TA, DA, HRA. 
Write a program using constructors which will initialize these values for 
object. Calculate total salary of the employee using the method.*/
import java.util.*;
class Salary{
  Scanner sc=new Scanner(System.in);
  double basic,TA,DA,HRA;
  Salary(){
    System.out.println("Enter the basic pay");
    basic=sc.nextDouble();
    System.out.println("Enter the TA ");
    TA=sc.nextDouble();
    System.out.println("Enter the DA");
    DA=sc.nextDouble();
    System.out.println("Enter the HRA");
    HRA=sc.nextDouble();
  }
  double totalSalary(){
    return basic+DA+TA+HRA;
  }
}
class Program4_5{
  public static void main(String args[]){
    System.out.println("Enter the salary details");
    Salary s1=new Salary();
    System.out.println("Total salary is: "+s1.totalSalary());
  }
}