/*Create two classes ‘Test1’ and ‘Test2’ which stores marks of a student. 
Read values of class objects and calculate average of these two tests using 
method.*/
import java.util.*;
class Test1{
  Scanner sc=new Scanner(System.in);
  int marks,marks2,marks3,marks4,marks5,tm;
  Test1(){
    System.out.println("Enter the marks for 5 subjects of UT1");
    marks=sc.nextInt();
    marks2=sc.nextInt();
    marks3=sc.nextInt();
    marks4=sc.nextInt();
    marks5=sc.nextInt();
  }
  int resultMark(){
    tm=(marks+marks2+marks3+marks4+marks5)/5;
    return tm;
  }
}
class Test2{
  Scanner sc=new Scanner(System.in);
  int marks,marks2,marks3,marks4,marks5,tm;
  Test2(){
    System.out.println("Enter the marks for 5 subjects of UT2");
    marks=sc.nextInt();
    marks2=sc.nextInt();
    marks3=sc.nextInt();
    marks4=sc.nextInt();
    marks5=sc.nextInt();
  }
  int resultMark(){
    tm=(marks+marks2+marks3+marks4+marks5)/5;
    return tm;
  }
}
class Program10{
  public static void main(String args[]){
    Test1 t1= new Test1();
    Test2 t2=new Test2();
    int avg;
    avg=(t1.resultMark() + t2.resultMark())/2;
    System.out.println("Average marks are:" +avg);
  }
}