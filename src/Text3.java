import java.io.*;
import java.util.*;

public class Text3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        try(FileInputStream fileInputStream= new FileInputStream(s);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader= new BufferedReader(inputStreamReader)) {
            List<Integer> digits= new ArrayList<>();
            while(bufferedReader.ready()){
            String str = bufferedReader.readLine();
            if (Integer.parseInt(str)%2==0)
            digits.add(Integer.parseInt(str));}

            Collections.sort(digits);

            for(Integer i : digits)
                System.out.println(i);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
