/*Overload the method ‘convertTo()’ with different parameters to convert 
terabytes, gigabytes and megabytes to equivalent bytes value.*/
import java.util.*;
class Program4_11{

  static long convertTo(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Megabytes");
    long mega=sc.nextLong();
    long bytecon=mega*1024*1024;
    return bytecon;
  }
  static long convertTo(long tera){
    long bytecon=tera*1024*1024*1024*1024;
    return bytecon;
  }
  static long convertTo(int giga){
    long bytecon=giga*1024*1024*1024;
    return bytecon; 
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Terabytes");
    long tera=sc.nextLong();
    System.out.println("The byte size is"+convertTo(tera));
    System.out.println("Enter the Gigabytes");
    int giga=sc.nextInt();
    System.out.println("The byte size is"+convertTo(giga));
    
    System.out.println("The byte size is"+convertTo());
  }
}