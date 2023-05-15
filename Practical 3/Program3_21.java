/*Define a class ‘Forest’ having data members: area_in_sq_cm, 
count_of_animals. Define appropriate methods to initialize and display the 
values of these data members. Input values for two objects and determine 
which forest is having more space per animal.*/
import java.util.*;
class Forest{
  double area_in_sq_cm;
  int count_of_animals;
  Scanner sc=new Scanner(System.in);
  void setData(){
    System.out.println("Enter the area in sq cm");
    area_in_sq_cm=sc.nextDouble();
    System.out.println("Enter the number of animals");
    count_of_animals=sc.nextInt();
  }
  void getData(){
    System.out.println("The area is: "+area_in_sq_cm);
    System.out.println("The count of animals is: "+count_of_animals);
  }
}
class Program3_21{
  public static void main(String args[]){
    Forest amazon=new Forest();
    Forest pandharpur=new Forest();
    amazon.setData();
    amazon.getData();
    pandharpur.setData();
    pandharpur.getData();
    if((amazon.area_in_sq_cm/amazon.count_of_animals)>(pandharpur.area_in_sq_cm/amazon.count_of_animals)){
      System.out.println("Amazon");
    }
    else{
      System.out.println("Pandharpur");
    }
  }
}