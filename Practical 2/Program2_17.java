//Count and display how many perfect square numbers are palindrome numbers from 1 to 100000. 
import java.util.*;
class Program2_17{
    static int count=0;
    public static void main(String [] args){
        double i,j,s=2;
        for(i=0;i<Math.sqrt(100000);i++){
            j=Math.pow(i,s);
            isPalindrome(j);
        }
        System.out.println("Total such integers are "+count);
    }
    static void isPalindrome(double j) {
        int num=(int)j,digit=0,rev=0;
        while(num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==j){
            System.out.println(rev);
            count++;
        }
    }
}
