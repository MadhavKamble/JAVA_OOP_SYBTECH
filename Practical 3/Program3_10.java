/*Define a class ‘Passport’ having data members: name, nationality and 
passport_number. Define appropriate methods to initialize and display the 
values of these data members. Input values for three objects and display it.*/
import java.util.*;
class Passport{
  Scanner sc=new Scanner(System.in);
  String name;
  String nationality;
  int passport_number;
  void setData(){
    System.out.println("Enter the name of candidate");
    name=sc.next();
    System.out.println("Enter the nationality");
    nationality=sc.next();
    System.out.println("Enter the passport number");
    passport_number=sc.nextInt();
  }
  void getData(){
    System.out.println("Name of the candidate: "+name);
    System.out.println("Nationality of candidate: "+nationality);
    System.out.println("Passport number: "+passport_number);
  }
}
class Program3_10{
  public static void main(String args[]){
    Passport p1=new Passport();
    Passport p2=new Passport();
    Passport p3=new Passport();
    System.out.println("Enter the data of first candidate");
    p1.setData();
    System.out.println("Enter the data of second candidate");
    p2.setData();
    System.out.println("Enter the data of third candidate");
    p3.setData();
    System.out.println("Data of first candidate");
    p1.getData();
    System.out.println("Data of second candidate");
    p2.getData();
    System.out.println("Data of third candidate");
    p3.getData();
  }
}