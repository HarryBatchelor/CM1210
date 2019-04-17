import java.util.*;
import java.io.*;
public class Encrypt {
    public static void main(String[] args) throws Exception{
        if (args.length != 1) {
            System.err.println("One argument expected!");
            System.exit(1);
        }
        String fileName = args[0];
        try {
            FileInputStream fileIs = new FileInputStream(fileName);
            ObjectInputStream is = new ObjectInputStream(fileIs);
            String msg = "";
            String s = (String) is.readUTF();

            System.out.println("Input = "+ s);
            for (char ch: s.toCharArray()) {

                int byteRead = (int) ch;
                if (byteRead <= 122){
                    if (byteRead >=97){
                        if (byteRead == 97){
                            byteRead = 123;
                        }
                        byteRead -= 1;

                    }
                }
                char newCh = (char) byteRead;
                 msg += newCh;
            }
            System.out.print("Output = " +msg);
        } catch (FileNotFoundException e) {
            System.out.println("Error finding file");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }


    }
}
