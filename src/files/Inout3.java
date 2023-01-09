package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Inout3 {
    public static void main(String[] args) {
        try(FileReader fileReader =new FileReader("src/files/text.txt");
            FileWriter fileWriter= new FileWriter("src/files/text1.txt")){
            char [] buffer = new char[500000];

            while(fileReader.ready()) {
                int x = fileReader.read(buffer);
                fileWriter.write(buffer,0,x);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
