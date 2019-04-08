import java.util.*;
import java.io.*;

class Encrypt
{
 public static void main(String args[]) throws Exception{

   if (args.length != 1){
     System.err.println("One argument expected!");
     System.exit(1);
   }

   FileReader fr = new FileReader(args[0]);
 Scanner sc=new Scanner(System.in);
 int shift,i,n;
 String str;
 String str1="";
 String str2="";
 System.out.println("Enter the plaintext");
 str=sc.nextLine();
 // str=str.toLowerCase();x
 n=str.length();
 char ch1[]=str.toCharArray();
 char ch3,ch4;
 shift=25;

 System.out.println();
 System.out.println("Encrypted text is");
 for(i=0;i<n;i++)
 {
 if(Character.isLetter(ch1[i]))
 {
 ch3=(char)(((int)ch1[i]+shift-97)%26+97);
 //System.out.println(ch1[i]+" = "+ch3);
 str1=str1+ch3;
 }
 else if(ch1[i]==' ')
 {
 str1=str1+ch1[i];
 }
 }
 System.out.println(str1);
 System.out.println(str2);
 }
}
