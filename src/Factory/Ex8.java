package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {
    public static CanFly result;
    public static void main(String[] args) {
        System.out.println(result);
    }
static {
        reset();
}

    public static void reset(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String s =br.readLine();
            if(s.equals("plane")){
                int x = Integer.parseInt(br.readLine());
                result= new Plane(x);}
            else if(s.equals("helicopter")){
                result= new Helicopter();}

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
        class Plane implements CanFly{
public int countPeople;

    public Plane(int countPeople) {
        this.countPeople = countPeople;
    }

    @Override
    public void fly() {

    }
}

class Helicopter implements CanFly{

    @Override
    public void fly() {

    }
}

interface CanFly{
    void fly();

}