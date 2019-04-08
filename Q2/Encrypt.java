import java.util.*;
import java.io.*;

public class Encrypt{
  public static void main(String[] args) throws Exception{
    if (args.length != 1){
      System.err.println("One argument expected!");
      System.exit(1);
    }
    FileReader fr = new FileReader(args[0]);
    int i;
    int newAscii = 0;

    while ((i=fr.read()) != -1)
      if ((int) i != -1){
        if ((int) i <=122  && (int) i >=98){  //if the ascii character is inbetween z and b then -1 from the ascii value
          newAscii = i -1;
        }
        else if ((int) i == 97){
          newAscii = 122; //if the ascii character is a then change it to z
        }
        else{
          newAscii = i; //Leaves capitals and special charcters the same value
        }
        System.out.print((char) newAscii);
      }
  }
}
