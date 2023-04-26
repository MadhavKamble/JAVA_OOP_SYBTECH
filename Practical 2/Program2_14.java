//Count how many perfect square numbers are also perfect cube numbers from 1 to 1000.
import java.util.*;
class Program2_14{
  static int num1,i,j;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    for(i=1;i<Math.sqrt(1000);i++){
      for(j=1;j<=i;j++){
        if(Math.pow(i,2)==Math.pow(j,3)){
          System.out.println(Math.pow(i,2));
        }

      }
    }

  }
}
