/*Define a class ‘Singer’ having data members: name, songs sung and 
awards. Define appropriate methods to initialize and display the values of 
these data members. Input values for two objects and determine who has 
taken maximum awards per song.
*/
import java.util.*;
class Singer{
  Scanner sc=new Scanner(System.in);
  String name;
  int songs;
  int awards;
  void setData(){
    System.out.println("Enter the name of the singer");
    name=sc.next();
    System.out.println("Enter the total number of songs sung");
    songs=sc.nextInt();
    System.out.println("Enter the total number of awards won");
    awards=sc.nextInt();
  }
  void getData(){
    System.out.println("Name  of the singer: "+name);
    System.out.println("Total number of songs sung: "+songs);
    System.out.println("Total number of awards won: "+awards);
  }
}
class Program3_8{
  public static void main(String args[]){
    Singer s1=new Singer();
    Singer s2=new Singer();
    System.out.println("Enter the data of first singer");
    s1.setData();
    System.out.println("Enter the data of second singer");
    s2.setData();
    System.out.println("Data of first singer");
    s1.getData();
    System.out.println("Data of second singer");
    s2.getData();
    if((s1.songs/s1.awards)>(s2.songs/s2.awards)){
      System.out.println(s2.name+" has more awards per song");
    }
    else{
      System.out.println(s1.name+" has more awards per song");
    }
  }
}