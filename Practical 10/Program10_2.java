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
  String name="SKNSCOE";
  void showIt();
}
class Board{
  Scanner sc=new Scanner(System.in);
  String name;
  void inputName(){
    System.out.println("Enter the name of the Board");
    this.name=sc.next();
  }
}
class MyClass extends Board implements College{
  String myname;
  void input(){
    System.out.println("Enter your name");
    myname=sc.next();
    super.inputName();
  }
public void showIt(){
  System.out.println("Name of Student: "+myname);
  System.out.println("Name of College: "+College.name);
  System.out.println("Name of the Board: "+super.name);
}
}
class Program10_2{
  public static void main(String args[]){
    MyClass m1=new MyClass();
    m1.input();
    m1.showIt();
  }
}