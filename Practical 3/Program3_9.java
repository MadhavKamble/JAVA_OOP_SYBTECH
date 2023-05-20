/* Define a class ‘Language’ having data members: state and population. 
Define appropriate methods to initialize and display the values of these data 
members. Input values for two objects and determine which language is 
widely spoken.*/
import java.util.*;
class Language{
  Scanner sc=new Scanner(System.in);
  String state;
  int population;
  void setData(){
    System.out.println("Enter the name of the state");
    state=sc.next();
    System.out.println("Enter the population of the state");
    population=sc.nextInt();
  }
  void getData(){
    System.out.println("Name of state: "+state);
    System.out.println("Population of state: "+population);
  }
}
class Program3_9{
  public static void main(String args[]){
    Language l1=new Language();
    Language l2=new Language();
    System.out.println("Enter the data for first language");
    l1.setData();
    System.out.println("Enter the data for second language");
    l2.setData();
    System.out.println("Data of first language:");
    l1.getData();
    System.out.println("Data of second language: ");
    l2.getData();
    if(l1.population>l2.population){
      System.out.println("Language 1 has more speakers");
    }
    else{
      System.out.println("Language 2 has more speakers");
    }
  }
}