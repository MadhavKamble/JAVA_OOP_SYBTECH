/*2. Implement the following inheritance:
College                      Board
name                         name
showIt()                     inputName()
  |                               |
  --------------    ---------------
                |   |
                MyClass   
                myname
                input()
*/
/*Here ambiguity occurs as "name" data variable is present in College and Board also(in question)*/
import java.util.*;
interface College{
  String cname="SKNSCOE";
  void showIt();
}
class Board{
  Scanner sc=new Scanner(System.in);
  String name;
  void inputName(){
    System.out.println("Enter the name of the Board");
    name=sc.next();
  }
}
class MyClass extends Board implements College{
  String myname;
  void input(){
    System.out.println("Enter your name");
    myname=sc.next();
    inputName();
  }
public void showIt(){
  System.out.println("Name of the College: "+cname);
}
}
class Program10_2{
  public static void main(String args[]){
    MyClass m1=new MyClass();
    m1.input();
    m1.showIt();
  }
}