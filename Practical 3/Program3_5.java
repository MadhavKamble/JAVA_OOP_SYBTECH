/*Define a class ‘Cone’ having data members: height and radius. Define 
appropriate methods to initialize and find the volume of cone. Input values 
for two objects and display radius of cone whose volume is greater.*/
import java.util.*;
class Cone{
  Scanner sc=new Scanner(System.in);
  double height;
  double radius;
  void setData(){
    System.out.println("enter the height of cone");
    height=sc.nextDouble();
    System.out.println("enter the radius");
    radius=sc.nextDouble();
  }
  void getData(){
    System.out.println("Volume of the cone: "+(22/7)*radius*radius*height/3);
  }
}
class Program3_5{
  public static void main(String args[]){
    Cone c1=new Cone();
    System.out.println("Enter the data for first cone");
    c1.setData();
    c1.getData();
    Cone c2=new Cone();
    System.out.println("Enter the data for second cone");
    c2.setData();
    c2.getData();
  }
}