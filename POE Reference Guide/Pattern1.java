/*Print following output using for loop:
*
***
*****
*******
*/
import java.util.*;
class Pattern1{
  static int row,i,j;
  public static void main(String args[]){
    System.out.println("Enter the number of rows");
    Scanner sc=new Scanner(System.in);
    row= sc.nextInt();
    for(i=1;i<=row;i++){
      for(j=1;j<=i;j++){
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}