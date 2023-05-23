/*Create a class ‘Student’ which will contain variables such as roll_no, name 
and course. Write a program to initialize these values for the object using 
constructors. Accept this data for three objects and display the data using 
method.*/
import java.util.*;
class Student{
  Scanner sc=new Scanner(System.in);
  int roll_no;
  String name,course;
  Student(){
    System.out.println("Enter the roll number of the student");
    roll_no=sc.nextInt();
    System.out.println("Enter the name of the student");
    name=sc.next();
    System.out.println("Enter the course name of the student");
    course=sc.next();
  }
  void display(){
    System.out.println("Roll number: "+roll_no);
    System.out.println("Name: "+name);
    System.out.println("Course name: "+course);
  }
}
class Program4_6{
  public static void main(String args[]){
    System.out.println("Enter the data of first student");
    Student s1=new Student();
    System.out.println("Enter the data of second student");
    Student s2=new Student();
    System.out.println("Enter the data of third student");
    Student s3=new Student();
    System.out.println("Data of first student");
    s1.display();
    System.out.println("Data of second student");
    s2.display();
    System.out.println("Data of third student");
    s3.display();
  }
}