import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Output {
    public static void main(String[] args) throws ClassNotFoundException {

        try{

            FileInputStream fileInputStream= new FileInputStream("src/files/text.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            byte[] buffer=  fileInputStream.readAllBytes();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
