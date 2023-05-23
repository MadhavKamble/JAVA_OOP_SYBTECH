/*Define a class ‘Air’ having data members: per_of_oxigen, per_of_nitrogen, 
and humidity. Define overloaded constructors to initialize and method to 
display the values of these data members. Make the use of this() to call 
among constructors. Input values for two objects and compare them 
according to value of humidity.
*/
/*note that we haven't used this() in this code, you can use it and can create a pull request (if you want)*/
import java.util.*;
class Air{
  Scanner sc=new Scanner(System.in);
  double per_of_oxygen,per_of_nitrogen,humidity;
  Air(){
    System.out.println("Enter percentage of oxygen");
    per_of_oxygen=sc.nextDouble();
    System.out.println("Enter percentage of nitrogen");
    per_of_nitrogen=sc.nextDouble();
    System.out.println("Enter humidity");
    humidity=sc.nextDouble();
  }
  Air(double per_of_oxygen){
    this.per_of_oxygen=per_of_oxygen;
    System.out.println("Enter percentage of nitrogen");
    per_of_nitrogen=sc.nextDouble();
    System.out.println("Enter humidity");
    humidity=sc.nextDouble();
  }
  void display(){
    System.out.println("Percentage of oxygen: "+per_of_oxygen);
    System.out.println("Percentage of nitrogen: "+per_of_nitrogen);
    System.out.println("Humidity: "+humidity);
  }
}
class Program4_3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the data of first sample of air");
    Air a1=new Air();
    System.out.println("Enter the data of second sample of air");
    System.out.println("Enter the percentage of oxygen");
    double a=sc.nextDouble();
    Air a2=new Air(a);
    System.out.println("Data of first sample of air");
    a1.display();
    System.out.println("Data of second sample of air");
    a2.display();
    if (a1.humidity > a2.humidity) {
            System.out.println("Air 1 has higher humidity.");
        } else if (a1.humidity < a2.humidity) {
            System.out.println("Air 2 has higher humidity.");
        } else {
            System.out.println("Both Air 1 and Air 2 have the same humidity.");
        }
  }
}