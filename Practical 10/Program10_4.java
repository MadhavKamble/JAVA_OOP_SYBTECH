import java.util.*;
interface Father{
  String surname="Xyz";
  void showIt();
}
class Mother{
  Scanner sc=new Scanner(System.in);
  String name;
  int age;
  void inputName(){
    System.out.println("Enter the name : ");
    this.name=sc.next();
    System.out.println("Enter the Age: ");
    this.age=sc.nextInt();
  }
}
class Mine extends Mother implements Father{
  String fname;
  void input(){
    System.out.println("Enter Father name");
    fname=sc.next();
  }
public void showIt(){
  System.out.println("Name : "+name);
  System.out.println("Father Name: "+fname);
  System.out.println("Surname Name : "+surname);
  System.out.println("Age : "+age);
}
}
class Program10_4{
  public static void main(String args[]){
    Mine m1=new Mine();
    m1.inputName();
    m1.input();
    m1.showIt();
  }
}