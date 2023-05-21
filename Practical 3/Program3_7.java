/*Define a class ‘WicketKeeper’ having data members: name, country, 
total_catches and total_stumpings. Define appropriate methods to initialize 
and display the values of these data members. Input values for two objects 
and determine who has taken maximum catches per stumping*/
import java.util.*;
class WicketKeeper{
  Scanner  sc=new Scanner(System.in);
  String name;
  String country;
  int total_catches;
  int total_stumpings;
  void setData(){
    System.out.println("Enter the name of the wicketkeeper");
    name=sc.next();
    System.out.println("Enter the name of his country");
    country=sc.next();
    System.out.println("Enter total number  of catches");
    total_catches=sc.nextInt();
    System.out.println("Enter total number of stumpings");
    total_stumpings=sc.nextInt();
  }
  void getData(){
    System.out.println("Name of Wicketkeeper: "+name);
    System.out.println("Country name: "+country);
    System.out.println("Total number of catches: "+total_catches);
    System.out.println("Total number of stumpings: "+total_stumpings);
  }
}
class Program3_7{
  public static void main(String args[]){
    WicketKeeper w1=new WicketKeeper();
    WicketKeeper w2=new WicketKeeper();
    System.out.println("Enter the data of first wicket keeper");
    w1.setData();
    System.out.println("Enter the data of second wicet keeper");
    w2.setData();
    System.out.println("Data of first wicket keeper");
    w1.getData();
    System.out.println("Data of second wicet keeper");
    w2.getData();
    if((w1.total_catches/w1.total_stumpings)>(w2.total_catches/w2.total_stumpings)){
      System.out.println(w1.name+" has more catches per stumping");
    }
    else{
      System.out.println(w2.name+" has more catches per stumping");
    }
  }
}