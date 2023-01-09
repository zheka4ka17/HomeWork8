package files;

import java.io.*;

public class Inout4 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream= new FileInputStream("src/files/text.bin");
            InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream);
        FileWriter fileWriter= new FileWriter("src/files/text.txt")){
            char[] buffer=new char[50000];
            while(inputStreamReader.ready()){
                int x= inputStreamReader.read(buffer);
                fileWriter.write(buffer,0,x);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
