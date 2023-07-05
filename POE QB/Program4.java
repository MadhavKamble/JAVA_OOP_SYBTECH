/*Define a class ‘Tennis’ having data members: player_name, country_name 
and total_championships. Define appropriate methods to initialize and display 
the values of these data members. Input values for three objects and 
determine who is real champion.*/
import java.util.*;
class Tennis{
  String player_name;
  String country_name;
  int total_championships;
  Scanner sc=new Scanner(System.in);
  void setData(){
    System.out.println("Enter the name of the player:");
    player_name=sc.nextLine();
    System.out.println("Enter the country name of the player");
    country_name=sc.nextLine();
    System.out.println("Enter the total number of championships won:");
    total_championships=sc.nextInt();
  }
  void getData(){
    System.out.println("Name: "+player_name);
    System.out.println("Country name: "+country_name);
    System.out.println("Total number of championship: "+total_championships);
  }
}
class Program4{
  public static void main(String args[]){
    Tennis t1=new Tennis();
    System.out.println("Enter the data for first player");
    t1.setData();
    Tennis t2=new Tennis();
    System.out.println("Enter the data for player 2");
    t2.setData();
    Tennis t3=new Tennis();
    System.out.println("Enter the data for player 3");
    t3.setData();
    if(t1.total_championships>t2.total_championships){
      if(t1.total_championships>t3.total_championships){
        t1.getData();
      }
      else{
        t3.getData();
      }
    }
    else{
      if(t2.total_championships>t3.total_championships){
        t2.getData();
      }
      else{
        t3.getData();
      }
    }
  }
}