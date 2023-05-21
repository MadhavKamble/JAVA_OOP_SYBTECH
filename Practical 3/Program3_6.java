/*Define a class ‘City’ having data members: name, population and 
administration. Define appropriate methods to initialize and display the 
values of these data members. Input values for three objects and find 
average population of all three.*/
import java.util.*;
class City{
  Scanner sc=new Scanner(System.in);
  String name;
  int population;
  void setData(){
    System.out.println("Enter the name of the city");
    name=sc.next();
    System.out.println("Enter the total population of city");
    population=sc.nextInt();
  }
  void getData(){
    System.out.println("Name of the city: "+name);
    System.out.println("Total population of the city: "+population);
  }
}
class Program3_6{
  public static void main(String args[]){
    City c1=new City();
    City c2=new City();
    City c3=new City();
    System.out.println("Enter the data of first city");
    c1.setData();
    System.out.println("Enter the data of second city");
    c2.setData();
    System.out.println("Enter the data of third city");
    c3.setData();
    System.out.println("Data of first city");
    c1.getData();
    System.out.println("Data of second city");
    c2.getData();
    System.out.println("Data of third city");
    c3.getData();
    System.out.println("Average population of three cities are: "+(c1.population+c2.population+c3.population)/3);
  }
}