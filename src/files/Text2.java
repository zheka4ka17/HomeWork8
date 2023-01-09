package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {


        try  (FileOutputStream  fileOutputStream = new FileOutputStream("src/files/text1.txt");
              OutputStreamWriter outputStreamWriter =new OutputStreamWriter(fileOutputStream)){
                String s= "" ;
                boolean flag= true;
                while (flag) {
                    Scanner scanner = new Scanner(System.in);
                   s =  scanner.nextLine();
                    if(!s.equals("exit"))
                   outputStreamWriter.write(s+"\n");
                    else flag=false;

                }
        } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

