/*Define a class ‘Department’ having data members: name_of_hod, 
total_students and per_of_result. Define appropriate methods to initialize 
and display the values of these data members. Input values for two objects 
and determine whose average result per student is better.*/
import java.util.*;
class Department{
  Scanner sc=new Scanner(System.in);
  String name_of_hod;
  int total_students;
  double per_of_result;
  double condition=per_of_result/total_students;
  void setData(){
    System.out.println("Enter the name of HOD");
    name_of_hod=sc.nextLine();
    System.out.println("Enter total number of students");
    total_students=sc.nextInt();
    System.out.println("Enter the per of result");
    per_of_result=sc.nextDouble();
  }
  void getData(){
    System.out.println("The name of the HOD is: "+ name_of_hod);
    System.out.println("Total number of students are: "+ total_students);
    System.out.println("Per of Result: "+ per_of_result);
  }
}
class Program3_20{
  public static void main(String args[]){
    Department d1=new Department();
    Department d2= new Department(); 
    d1.setData();
    d1.getData();
    d2.setData();
    d2.getData();
    if(d1.condition>d2.condition){
      System.out.println("First department is better");
    }
    else{
      System.out.println("Second department is better");
    }
  }
}