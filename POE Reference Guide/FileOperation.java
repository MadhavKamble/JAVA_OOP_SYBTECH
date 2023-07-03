import java.io.*;
class FileOperation{
  public static void main(String args[])throws Exception{
    FileReader fr=new FileReader("D:/JAVA_OOP_SYBTECH/POE Reference Guide/FileReadingText.txt");
    int i;
    while((i=fr.read())!=-1)
      System.out.print((char)i);
  
    FileWriter fw=new FileWriter("D:/JAVA_OOP_SYBTECH/POE Reference Guide/FileReadingText.txt");
    String str ="Hi this is first line"+"\nThank you"+"\nHi this is last line";
    fw.write(str);
    fr.close();
    fw.close();
  }
}