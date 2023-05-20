/*Define a class ‘Person’ having data members: name, age and qualification. 
Define appropriate methods to initialize and display the values of these data 
members. Input values for two objects and determine the qualification of 
person who is younger.*/
import java.util.*;
class Person{
  Scanner sc=new Scanner(System.in);
  String name;
  int age;
  String qualification;
  void setData(){
    System.out.println("Enter the name ");
    name=sc.next();
    System.out.println("Enter the age");
    age=sc.nextInt();
    System.out.println("Enter your qualification");
    qualification=sc.next();
  }
  void getData(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Qualification: "+qualification);
  }
}
class Program3_13{
  public static void main(String args[]){
    Person p1=new Person();
    Person p2=new Person();
    System.out.println("Enter data for first person");
    p1.setData();
    System.out.println("Enter data for second person");
    p2.setData();
    System.out.println("Data of first person");
    p1.getData();
    System.out.println("Data of second person");
    p2.getData();
    if(p1.age > p2.age){
      System.out.println(p2.qualification);
    }
    else{
      System.out.println(p1.qualification);
    }
  }
}