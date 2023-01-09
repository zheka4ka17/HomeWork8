import java.io.*;

public class Text {

        public static void main(String[] args) {
            //Scanner scanner = new Scanner(System.in);
            String str = "src/files/text.txt";
            try (FileInputStream inputStream = new FileInputStream(str);
                 InputStreamReader inputStreamReader = new InputStreamReader(inputStream))

            {  while (inputStreamReader.ready()){
                char c = (char)inputStreamReader.read();
                System.out.print(c);}

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

