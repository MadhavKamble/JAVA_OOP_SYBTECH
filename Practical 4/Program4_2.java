/*Define a class ‘Forest’ having data members: area_in_sq_cm, 
count_of_animals. Define overloaded constructors to initialize and method to 
display the values of these data members. Input values for two objects and 
determine which forest is having less space per animal.
*/
import java.util.*;
class Forest{
  Scanner sc=new Scanner(System.in);
  double area_in_sq_cm;
  int count_of_animals;
  Forest(){
    System.out.println("Enter the area of forest");
    area_in_sq_cm=sc.nextDouble();
    System.out.println("Enter the count of animals");
    count_of_animals=sc.nextInt();
  }
  Forest(double area_in_sq_cm){
    this.area_in_sq_cm=area_in_sq_cm;
    System.out.println("Enter the count of animals");
    count_of_animals=sc.nextInt();
  }
  void display(){
    System.out.println("Area of forest: "+area_in_sq_cm);
    System.out.println("Total count of animals: "+count_of_animals);
  }
}
class Program4_2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the data of First forest");
    Forest f1=new Forest();
    System.out.println("Enter the data of second forest");
    System.out.println("Enter the area of forest");
    double a=sc.nextDouble();
    Forest f2=new Forest(a);
    System.out.println("Data of first forest is: ");
    f1.display();
    System.out.println("Data of second forest is: ");
    f2.display();
  
  if((f1.count_of_animals/f1.area_in_sq_cm)>(f2.count_of_animals/f2.area_in_sq_cm)){
    System.out.println("First forest has less space per animal");
  }
  else{
    System.out.println("Second forest has less space per animal");
  }
  }
}