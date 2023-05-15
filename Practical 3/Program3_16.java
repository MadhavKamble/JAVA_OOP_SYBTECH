/*Define a class ‘MountainPeak’ having data members: name, country and 
height (in meters). Define appropriate methods to initialize and display the 
values of these data members. Input values for two objects and display the 
information of peak whose height is larger*/
import java.util.*;
class MountainPeak{
  Scanner sc=new Scanner(System.in);
  String name,country;
  int height;
  void setData(){
    System.out.println("Enter the name of the mountain peak");
    name=sc.next();
    System.out.println("Enter the name of the country");
    country=sc.next();
    System.out.println("Enter the height");
    height=sc.nextInt();
  }
  void getData(){
    System.out.println("Name of mountain: "+name);
    System.out.println("Name of the country: "+country);
    System.out.println("Height of the mountain is: "+height);
  }
}
class Program3_16{
  public static void main(String args[]){
    MountainPeak m1=new MountainPeak();
    MountainPeak m2=new MountainPeak();
    m1.setData();
    m1.getData();
    m2.setData();
    m2.getData();
    System.out.printn(Math.max(m1.height,m2.height));
  }
}