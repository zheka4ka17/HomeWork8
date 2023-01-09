package Factory;

import java.io.*;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s="";
        boolean flag= true;
        while (flag){
            try {
                s=bufferedReader.readLine();
                Movie movie= MovieFactory.getMovie(s);
                if (movie==null)
                    break;
                System.out.println(movie.getClass().getSimpleName());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

   static class MovieFactory{

        public static Movie getMovie(String key){
            Movie movie= null;

            if (key.equals("cartoon"))
                movie= new Cartoon();
            else if (key.equals("thriller"))
                movie= new Thriller();
            else if (key.equals("soap opera"))
                movie=new SoapOpera();

            return movie;


        }
    }
}
abstract class Movie{

}
class SoapOpera extends Movie{

}

class Cartoon extends Movie{

}

class Thriller extends Movie{

}

