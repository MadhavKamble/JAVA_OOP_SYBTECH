//Accept marks of 10 different students from keyboard and analyze it. That is, count total first, second and pass class students
import java.util.*;
class Program2_12{
  static int marks[]=new int[10];
  static int total=0,first=0,second,pass,i;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of 10 students out of 100: ");
    for(i=0;i<marks.length;i++){
      marks[i]=sc.nextInt();
    }
    //first place and total and pass
    for(i=0;i<marks.length;i++){
      if(marks[i]<=100){
      total=total+marks[i];
      if(first<marks[i]){
        first=marks[i];
      } 
      if(marks[i]>35){
        pass++;
      }     
    }
    }
    //second place
    for(i=0;i<marks.length;i++){
      if(marks[i]<=100){
      if(second<marks[i]){
        if(marks[i]==first){
          continue;
        }
        else{
          second=marks[i];
        }
      }      
    }
    }
    System.out.println("The results are:");
    System.out.println("First: "+ first);
    System.out.println("Second: "+second);
    System.out.println("Total Pass Students: "+pass);
    System.out.println("Total score: "+total);
  }
}
/* second method
sort the array using inbuilt sorting method of class Arrays
==> Arrays.sort(array_name);
and then display the last two index items as largest and second largest  */