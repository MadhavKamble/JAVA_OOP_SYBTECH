/*Define a class ‘Nation’ having data members: name, capital and 
density_of_population. Define appropriate methods to initialize and display 
the values of these data members. Input values for two objects and find 
name & capital of nation who’s having less density of population.*/
import java.util.*;
class Nation{
  Scanner sc=new Scanner(System.in);
  String name;
  String capital;
  double density;
  void setData(){
    System.out.println("Enter the name of the country");
    name=sc.next();
    System.out.println("Enter the capital city");
    capital=sc.next();
    System.out.println("Enter the density of population");
    density=sc.nextDouble();
  }
  void getData(){
    System.out.println("Name of country: "+name);
    System.out.println("Capital city of country: "+capital);
    System.out.println("Density population is: "+density);
  }
}
class Program3_11{
  public static void main(String args[]){
    Nation n1=new Nation();
    Nation n2=new Nation();
    System.out.println("Enter the data of first nation");
    n1.setData();
    System.out.println("Enter the data of second nation");
    n2.setData();
    if(n1.density> n2.density){
      n2.getData();
    }
    else{
      n1.getData();
    }
  }
}