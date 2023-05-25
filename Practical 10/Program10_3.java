import java.util.*;
interface Cricket{
  int no_of_players=11;
  void showIt();
}
interface Baseball extends Cricket{
  void initialize();
}
class Games{
  Scanner sc=new Scanner(System.in);
  String nation;
  void inputIt(){
    System.out.println("Enter the Name of the Nation");
    nation=sc.next();
  }
}
class Sports extends Games implements Baseball{
 int total_sports;
 public void showIt(){
  System.out.println("Name of Nation: "+nation);
  System.out.println("Total number of players in Cricket team: "+no_of_players);
  System.out.println("Total number of sports played: "+total_sports);
 }
 public void initialize(){
  inputIt();
  System.out.println("Enter the total number of sports");
  total_sports=sc.nextInt();
  showIt();
 }
}
class Program10_3{
  public static void main(String args[]){
    Sports s1=new Sports();
    s1.initialize();
  }
}