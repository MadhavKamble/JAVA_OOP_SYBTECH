/*Define a class ‘Poetry’ having data members: title, poet_name and 
total_verses. Define appropriate methods to initialize and display the values 
of these data members. Input values for two objects and determine whose 
poetry is longest. Display the name of poetry also.*/
import java.util.*;
class Poetry{
  Scanner sc=new Scanner(System.in);
  String title;
  String poet_name;
  int total_verses;
  void setData(){
    System.out.println("Enter the name of the poem");
    title=sc.nextLine();
    System.out.println("Enter the name of the poet");
    poet_name=sc.next();
    System.out.println("Enter the total number of verses");
    total_verses=sc.nextInt();
  }
  void getData(){
    System.out.println("The Title of the poem is: "+title);
    System.out.println("The name of the poet is: "+poet_name);
    System.out.println("Total number of verses are: "+total_verses);
  }
}
class Program3_19{
  public static void main(String args[]){
    Poetry Poet1=new Poetry();
    Poetry Poet2=new Poetry();
    Poet1.setData();
    Poet1.getData();
    Poet2.setData();
    Poet2.getData();
    if(Poet1.total_verses>Poet2.total_verses){
      System.out.println(Poet1.poet_name+"'s verse is longer");
    }
    else{
      System.out.println(Poet2.poet_name+"'s verse is longer");
    }
  }
}