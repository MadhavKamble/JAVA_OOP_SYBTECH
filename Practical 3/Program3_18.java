/*Define a class ‘Examination’ having data members: year and total_students_appeared. Define appropriate methods to initialize and display 
the values of these data members. Input values for three objects and determine the examination in which largest number of students appeared.*/
import java.util.*;
class Examination{
  Scanner sc=new Scanner(System.in);
  int year,total_students_appeared;
  void setData(){
    System.out.println("Enter the graduation year");
    year=sc.nextInt();
    System.out.println("Enter total number of students appeared ");
    total_students_appeared=sc.nextInt();
  }
  void getData(){
    System.out.println("Graduation year is: "+year);
    System.out.println("Total number of students appeared are: "+total_students_appeared);
  }
  Examination conditionCheck(Examination obj1,Examination obj2){
    if(obj1.total_students_appeared>obj2.total_students_appeared){
      return obj1;
    }
    else{
      return obj2;
    }
  }
}
class Program3_18{
  public static void main(String args[]){
    Examination FYBTECH=new Examination();
    Examination SYBTECH=new Examination();
    Examination TYBTECH=new Examination();
    FYBTECH.setData();
    FYBTECH.getData();
    SYBTECH.setData();
    SYBTECH.getData();
    TYBTECH.setData();
    TYBTECH.getData();
    Examination obj3=new Examination();
    obj3=obj3.conditionCheck(FYBTECH,SYBTECH);
    obj3=obj3.conditionCheck(TYBTECH,obj3);
    System.out.println("Most number of students appeared in: "+obj3.year);
  }
}