package Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Apartment> list= Arrays.asList(new OneRoomApt(),new ThreeRoomApt(), new TwoRoomApt());

        cleanAllApartments(list);

    }
    public static void cleanAllApartments(List<Apartment> apartments) {
       for (Apartment apartment : apartments)
       if (apartment instanceof  OneRoomApt)
          ((OneRoomApt) apartment).cleanOneRoom();
       else if (apartment instanceof  TwoRoomApt)
           ((TwoRoomApt) apartment).cleanTwoRooms();
       else if (apartment instanceof  ThreeRoomApt)
           ((ThreeRoomApt) apartment).cleanThreeRoom();
    }
}
interface Apartment{

}

class OneRoomApt implements Apartment{
public void cleanOneRoom(){
    System.out.println("1 room is cleaned");
}
}

class TwoRoomApt implements Apartment{
    public void cleanTwoRooms(){
        System.out.println("2 rooms are cleaned");
    }
}


class ThreeRoomApt implements Apartment{
    public void cleanThreeRoom(){
        System.out.println("3 rooms are cleaned");
    }


}