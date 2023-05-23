/*4. Declare a class ‘Distance’ having data members dist1, dist2 and dist3. 
Initialize two data members using constructors and store their addition using 
method and display the addition.
*/
import java.util.*;
class Distance{
  Scanner sc=new Scanner(System.in);
  double dist1,dist2, dist3;
  Distance(){
    System.out.println("Enter the distance 1");
    dist1=sc.nextDouble();
    System.out.println("Enter the distance 2");
    dist2=sc.nextDouble();
    System.out.println("Enter the distance 3");
    dist3=sc.nextDouble();
  }
  double addition(){
    double total_distance= dist1+dist2+dist3;
    return total_distance;
  }
}
class Program4_4{
  public static void main(String args[]){
    System.out.println("Enter the first set of data");
    Distance d1=new Distance();
    System.out.println("It's total addition is: "+d1.addition());
    System.out.println("Enter the second set of data");
    Distance d2=new Distance();
    System.out.println("It's total addition is: "+d2.addition());
  }
}