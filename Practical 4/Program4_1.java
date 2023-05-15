/*Define a class ‘Department’ having data members: name_of_hod, 
total_students and per_of_result. Define overloaded constructors to initialize 
and method to display the values of these data members. Input values for 
two objects and determine whose average result per student is worse*/
import java.util.*;
class Department4_1{
  Scanner sc=new Scanner(System.in);
  String name_of_hod;
  int total_students;
  double per_of_result;
  double condition=per_of_result/total_students;

  Department4_1(){
    System.out.println("Enter the Data For First Department");
    System.out.println("Enter the name of HOD");
    name_of_hod=sc.nextLine();
    System.out.println("Enter total number of students");
    total_students=sc.nextInt();
    System.out.println("Enter the per of result");
    per_of_result=sc.nextDouble();
  }

  Department4_1(String name_of_hod){
    this.name_of_hod=name_of_hod;
    System.out.println("Enter total number of students");
    total_students=sc.nextInt();
    System.out.println("Enter the per of result");
    per_of_result=sc.nextDouble();
  }

  void display(){
    System.out.println("The name of the HOD is: "+ name_of_hod);
    System.out.println("Total number of students are: "+ total_students);
    System.out.println("Per of Result: "+ per_of_result);
  }
}
class Program4_1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Department4_1 d1=new Department4_1();
    System.out.println("Enter the Name of HOD for second Department");
    String name =sc.nextLine();
    Department4_1 d2= new Department4_1(name);
    
    if(d1.condition>d2.condition){
      System.out.println("First department is better");
    }
    else{
      System.out.println("Second department is better");
    }
  }
}