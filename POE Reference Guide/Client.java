import java.util.*;
import java.net.*;
import java.io.*;
class Client{
  public static void main(String args[]) throws Exception{
    Socket s=new Socket("localhost",12345);
    Scanner sc=new Scanner(System.in);
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());   
    String str="";
    while(!(str.equals("BYE"))){
      str=sc.nextLine();
      dout.writeUTF(str);
      System.out.println("Server Says:"+ din.readUTF());
    }
  }
}