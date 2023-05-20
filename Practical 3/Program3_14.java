/*Define a class ‘Planet’ having data members: revolution_around_self, 
revolution_around_sun and total satellites. Define appropriate methods to 
initialize and display the values of these data members. Input values for two 
objects and determine which planet is nearer to the sun.
*/
import java.util.*;
class Planet{
  Scanner sc= new Scanner(System.in);
  double rotations;
  int revolution_around_sun;
  int total_satellites;
  void setData(){
    System.out.println("Enter the number of days for one rotation");
    rotations=sc.nextDouble();
    System.out.println("Enter the number of days for a revolution around sun");
    revolution_around_sun=sc.nextInt();
    System.out.println("Enter the total number satellites");
    total_satellites=sc.nextInt();
  }
  void getData(){
    System.out.println("Number of rotations "+rotations);
    System.out.println("Number of revolutions around sun "+revolution_around_sun);
    System.out.println("Total number of satellites are "+total_satellites);
  }
}
class Program3_14{
  public static void main(String args[]){
    Planet p1=new Planet();
    Planet p2=new Planet();
    System.out.println("Enter the data for first planet");
    p1.setData();
    System.out.println("Enter the data for second planet");
    p2.setData();
    System.out.println("Details of first planet is: ");
    p1.getData();
    System.out.println("Details of second planet is: ");
    p2.getData();
    if(p1.revolution_around_sun > p2.revolution_around_sun){
      System.out.println("Second planet is nearer to the sun");
    }
    else{
      System.out.println("First planet is nearer");
    }
  }
}