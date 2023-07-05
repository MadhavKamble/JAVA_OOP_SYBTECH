/*Define a class ‘BankAccount’ having data members: acc_no, name and 
balance. Define appropriate methods to initialize and display the values of 
these data members. Input values for two objects and determine who is 
having more balance in his/her account.*/
import java.util.*;
class BankAccount{
  Scanner sc=new Scanner(System.in);
  String name;
  int acc_no;
  Double balance;
  void setData(){
    System.out.println("Enter the name");
    name=sc.nextLine();
    System.out.println("Enter the account number");
    acc_no=sc.nextInt();
    System.out.println("Enter the total balance");
    balance=sc.nextDouble(); 
  }
  void getData(){
    System.out.println("Name: "+name);
    System.out.println("Account Number: "+acc_no);
    System.out.println("Balance: "+balance);
  }
}
class Program3_1{
  public static void main(String args[]){
    BankAccount b1=new BankAccount();
    System.out.println("Enter the data for first Bank Account");
    b1.setData();
    BankAccount b2=new BankAccount();
    b2.setData();
    if(b1.balance>b2.balance){
      b1.getData();
    }
    else{
      b2.getData();
    }
  }
}