import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inout {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream= new FileInputStream("src/files/text.bin");
            FileOutputStream fileOutputStream= new FileOutputStream("src/files/text1.bin"))
        {
            byte [] buffer = fileInputStream.readAllBytes();
            fileOutputStream.write(buffer);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
