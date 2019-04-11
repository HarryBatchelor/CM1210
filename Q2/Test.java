
import java.io.*;
public class Test {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("One argument expected!");
            System.exit(1);
        }

        try {
            FileInputStream fileIs = new FileInputStream(args[0]);
            ObjectInputStream is = new ObjectInputStream(fileIs);
            String msg = "";
            String x = (String) is.readUTF();

            System.out.println("Input = "+ x);
            for (char ch: x.toCharArray()) {

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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
