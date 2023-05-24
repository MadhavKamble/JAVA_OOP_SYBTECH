/*Define a class ‘Product’ having data members product_id, product_name 
and price. Create overloaded constructors to initialize these members. Use 
methods to calculate total price of two different objects.
*/
import java.util.*;
class Product{
  Scanner sc=new Scanner(System.in);
  int product_id;
  String product_name;
  int price;
  Product(){
    System.out.println("Enter the product ID");
    product_id=sc.nextInt();
    System.out.println("Enter the name of the product");
    product_name=sc.next();
    System.out.println("Enter the price of the product");
    price=sc.nextInt();
  }
  Product(int product_id){
    this.product_id=product_id;
    System.out.println("Enter the name of the product");
    product_name=sc.next();
    System.out.println("Enter the price of the product");
    price=sc.nextInt();
  }
  Product totalPrice(Product p1,Product p2 ){
    p1.price=p1.price+p2.price;
    return p1;
  }
}
class Program4_7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the data of first product");
    Product p1=new Product();
    System.out.println("Enter the data for second product");
    System.out.println("Enter the product ID");
    int a=sc.nextInt();
    Product p2=new Product(a);
    p1=p1.totalPrice(p1,p2);
    System.out.println("Total price of both product is: "+p1.price);
  }
}