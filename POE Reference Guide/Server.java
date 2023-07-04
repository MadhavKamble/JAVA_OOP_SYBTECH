import java.util.*;
import java.net.*;
import java.io.*;
class Server{
  public static void main(String args[]) throws Exception{
    ServerSocket ss=new ServerSocket(12345);
    Socket s=ss.accept();
    Scanner sc=new Scanner(System.in);
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());   
    String str="";
    while(!(str.equals("BYE"))){
      System.out.println("Client Says:"+ din.readUTF());
      str=sc.nextLine();
      dout.writeUTF(str);
    }
  }
}