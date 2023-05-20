/*Define a class ‘Light’ having data members: speed_in_water, speed_in_air 
and speed_in_vacuum. Define appropriate methods to initialize and display 
the values of these data members. Input values for one object and 
determine whether speed of light in air and in vacuum is same or not.*/
import java.util.*;
class Light{
  Scanner sc=new Scanner(System.in);
  double speed_in_air,speed_in_vacuum,speed_in_water;
  void setData(){
    System.out.println("Enter the speed of light in vaccum");
    speed_in_vacuum=sc.nextDouble();
    System.out.println("Enter the speed of light in air");
    speed_in_air=sc.nextDouble();
    System.out.println("Enter the speed of light in water");
    speed_in_water=sc.nextDouble();
  }
  void getData(){
    System.out.println("Speed of light in vaccum: "+speed_in_vacuum);
    System.out.println("Speed of light in air: "+speed_in_air);
    System.out.println("Speed of light in water: "+speed_in_water);
  }
}
class Program3_12{
  public static void main(String args[]){
    Light l1=new Light();
    System.out.println("Enter the value of speeds of light in different medium");
    l1.setData();
    System.out.println("Values of speed of light in respective mediums are");
    l1.getData();
    if(l1.speed_in_air == l1.speed_in_vacuum){
      System.out.println("YES! Speed of light is same in air and vaccum");
    }
    else{
      System.out.println("No, speed of light in air is different in air and water");
    }
  }
}