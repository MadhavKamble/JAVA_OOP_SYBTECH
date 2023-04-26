//Input the clock time and find the angle made between the ticks of the analog clock.
import java.util.*;
class Program2_18{
  static int hour,min;
  static double hourangle, minangle,angle;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the hour(in 12 hours format)");
    hour=sc.nextInt();
    System.out.println("Enter the minutes");
    min=sc.nextInt();
    clockAngle(hour,min);
  }
  public static void clockAngle(int hour,int min){
    
    if(hour==12){
      hour=0;
    }
    hourangle=(hour*30)+(0.5*min);
    minangle=(min*6);
    //CASE 1
    if(hourangle<=180 && minangle<=180){
      angle=minangle-hourangle;
      if(angle<0){
      angle=angle*(-1);
    }
    System.out.println("The angle between hands of clock is: "+angle);
    }
    //CASE 2
    if(hourangle>180 && minangle>180){
      hourangle=360-hourangle;
      minangle=360-minangle;
      angle=minangle-hourangle;
      if(angle<0){
      angle=angle*(-1);
    }
    System.out.println("The angle between hands of clock is: "+angle);
    }
    //CASE 3
    if((hourangle>180 && minangle<=180)||(hourangle<=180 && minangle>180)){
      if(minangle>180){
        minangle=360-minangle;
      }
      if(hourangle>180){
        hourangle=360-hourangle;
      }
      angle=minangle+hourangle;
    System.out.println("The angle between hands of clock is: "+angle);
    }
  }
}