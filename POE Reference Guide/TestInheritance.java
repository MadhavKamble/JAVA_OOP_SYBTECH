/*Create a base class to get two numbers from user in the base class and 
one number from derived class. The derived class contains a method
‘dispMax()’, which displays maximum of three numbers, a method 
‘dispMin()’ to display minimum of three numbers and method equality( ) 
which checks whether any two of these three numbers are equal or not. 
Use constructors.*/
import java.util.*;
class BaseClass{
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  BaseClass(){
    System.out.println("Enter the first number");
    a=sc.nextInt();
    System.out.println("Enter the second number");
    b=sc.nextInt();
  }
}
class DerivedClass extends BaseClass{
  DerivedClass(){
    System.out.println("Enter the third number");
    c=sc.nextInt();
  }
  void dispMax(){
    if(a>b){
      if(a>c){
        System.out.println(a+" is the largest number");
      }
      else{
        System.out.println(c+" is the largest number");
      }
    }
    else{
      if(b>c){
        System.out.println(b+" is the largest");
      }
      else{
        System.out.println(c+" is the largest");
      }
    }
  }
  void dispMin(){
    if(a>b){
      if(b>c){
        System.out.println(c+" is the smallest number");
      }
      else{
        System.out.println(b+" is the smallest number");
      }
    }
    else{
      if(a>c){
        System.out.println(c+" is the smallest");
      }
      else{
        System.out.println(a+" is the smallest");
      }
    }
  }
  void equality(){
    if(a==b){
      if(b==c){
        System.out.println("All numbers are equal");
      }
      else{
        System.out.println("A and B are equal");
      }
    }
    else if(b==c){
      System.out.println("B and C are equal");
    }
    else if(a==c){
      System.out.println("A and C are equal");
    }
    else{
      System.out.println("None of the numbers are equal");
    }
  }
}
class TestInheritance{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    DerivedClass d1=new DerivedClass();
    d1.dispMax();
    d1.dispMin();
    d1.equality();
  }
}