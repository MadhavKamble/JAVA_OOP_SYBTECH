import java.util.*;
interface Gross{
  double TA =10, DA=100 ;
  double grossSalary();
  
}
class Employee{
  Scanner sc=new Scanner(System.in);
  String name;
  double base;
  void basicSalary(){
    System.out.println("enter your name");
    name=sc.next();
    System.out.println("enter the base salary");
    base=sc.nextDouble();
  }
}
class Salary extends Employee implements Gross{
  Scanner sc=new Scanner(System.in);
  double hra=20;
 
public double grossSalary(){
    return (base+(base/10)+(base)+(base/5));
  }
  void displaySalary(){
    basicSalary();
    System.out.println("Total salary is: "+ grossSalary() );
  }
}
class TestInterface{
  public static void main(String args[]){
    Salary s1=new Salary();
    s1.displaySalary();
  }
}