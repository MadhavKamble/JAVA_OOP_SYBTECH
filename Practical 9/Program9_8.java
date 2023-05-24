/* Implement following inheritance. By invoking the constructors of ‘Word2007’ initialize the year values of all classes and by calling
display4() method display the years of all classes (Hint: Make the effective use of ‘this’ and ‘super’.
Word98
• year
• price
- display1( )
    |
    |
Word2000
• year
• price
- display2( )
    |
    |
Word2003
• year
• price
- display3( )
    |
    |
Word2007
• year
• price
- display4( )
*/
import java.util.*;
class Word98{
  Scanner sc=new Scanner(System.in);
  int year;
  int price;
  Word98(){
    System.out.println("Enter the year Word 1998");
    year=sc.nextInt();
    System.out.println("Enter the price");
    price=sc.nextInt();
  }
  void display1(){
    System.out.println("The year is: "+this.year);
    System.out.println("The price is: "+this.price);
  }
}
class Word2000 extends Word98{
  int year;
  int price;
  Word2000(){
    super();
    System.out.println("Enter the year Word 2000");
    year=sc.nextInt();
    System.out.println("Enter the price");
    price=sc.nextInt();
  }
  void display2(){
    display1();
    System.out.println("The year: "+this.year);
    System.out.println("The price: "+this.price);
    
  }
}
class Word2003 extends Word2000{
  int year;
  int price;
  Word2003(){
    super();
    System.out.println("Enter the year of Word 2003");
    year=sc.nextInt();
    System.out.println("Enter the price");
    price=sc.nextInt();
  }
  void display3(){
    display2();
    System.out.println("The year: "+this.year);
    System.out.println("The price: "+this.price);
  }
}
class Word2007 extends Word2003{
  int year;
  int price;
  Word2007(){
    super();
    System.out.println("Enter the year of Word 2007");
    year=sc.nextInt();
    System.out.println("Enter the price");
    price=sc.nextInt();
  }
  void display4(){
    display3();
    System.out.println("The year: "+this.year);
    System.out.println("The price: "+this.price);
  }
}
class Program9_8{
  public static void main(String args[]){
    Word2007 w1=new Word2007();
    w1.display4();
  }
}