//Find the number of and sum of all the integers greater than 100 and less than 200 that are divisible by 7.
import java.util.*;
class Program2_11{
  static int i,sum=0,count=0;
  public static void main(String args[]){
    for(i=100;i<200;i++){
      if(i%7==0){
        sum=sum+i;
        count++;
      }
    }
    System.out.println("Total numbers of such integers are " + count+" and their total sum is "+ sum);
  }
}