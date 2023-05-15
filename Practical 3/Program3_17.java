/*Define a class ‘Library’ having data members: total_books, total_magazines 
and total_periodicals. Define appropriate methods to initialize and display the 
values of these data members. Input values for two objects and determine 
which library is having largest collection of all books.*/
import java.util.*;
class Library{
  Scanner sc=new Scanner(System.in);
  int total_books,total_magazines,total_periodicals;
  void setData(){
    System.out.println("Enter total number of books: ");
    total_books=sc.nextInt();
    System.out.println("Enter total number of magazines: ");
    total_magazines=sc.nextInt();
    System.out.println("Enter total number of periodicals: ");
    total_periodicals=sc.nextInt();
  }
  void getData(){
    System.out.println("Total number of books are: "+total_books);
    System.out.println("Total number of magazines are: "+total_magazines);
    System.out.println("Total number of periodicals are: "+total_periodicals);
  }
}
class Program3_17{
  public static void main(String args[]){
    Library l1=new Library();
    Library l2=new Library();
    l1.setData();
    l1.getData();
    l2.setData();
    l2.getData();
    if(l1.total_books>l2.total_books){
      System.out.println("First library has more books");
    }
    else{
      System.out.println("Second library has more number of books");
    }
  }
}