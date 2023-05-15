/*Define a class ‘PoliticalParty’ having data members: name, total_MLAs, 
total_MLCs and total_MPs. Define appropriate methods to initialize and 
display the values of these data members. Input values for two objects and 
determine the total leaders of these parties are elected by citizens.*/
import java.util.*;
class PoliticalParty{
  Scanner sc=new Scanner(System.in);
  String name;
  int total_MLAs,total_MLCs,total_MPs;
  void setData(){
    System.out.println("Enter the name of the political party");
    name=sc.nextLine();
    System.out.println("Enter total number of MLA's");
    total_MLAs=sc.nextInt();
    System.out.println("Enter total number of MLC's");
    total_MLCs=sc.nextInt();
    System.out.println("Enter total number of MP's");
    total_MPs=sc.nextInt();
  }
  void getData(){
    System.out.println("Name of the Political party is: "+name);
    System.out.println("Total number of MLA's in Political party is: "+total_MLAs);
    System.out.println("Total number of MLC's in Political party is: "+total_MLCs);
    System.out.println("Total number of MP's in Political party is: "+total_MPs);
  }
}

class Program3_15{
  public static void main(String args[]){
    PoliticalParty p1=new PoliticalParty();
    PoliticalParty p2=new PoliticalParty();
    p1.setData();
    p1.getData();
    p2.setData();
    p2.getData();
    System.out.println("Total numbers of elected leaders of "+p1.name+" is: "+(p1.total_MLAs+p1.total_MPs));
    System.out.println("Total numbers of elected leaders of "+p2.name+" is: "+(p2.total_MLAs+p2.total_MPs));
  }
}