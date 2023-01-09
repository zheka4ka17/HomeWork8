import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inout2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream= new FileInputStream("src/files/text.bin");
            FileOutputStream fileOutputStream= new FileOutputStream("src/files/text1.bin")) {
            byte [] buffer = new byte[455660];
            while(fileInputStream.available()>0){
                int x =fileInputStream.read(buffer);
                fileOutputStream.write(buffer, 0,x);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
