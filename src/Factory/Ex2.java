package Factory;

public class Ex2 {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getSparklingWine() {
        return new SparklingWine();
    }
}


abstract class Drink{
    public void taste(){
        System.out.println("Вкусно");
    }
}
class Wine extends Drink{
    public String getHolidayName(){
        return "День Рождение";

    }
}
class SparklingWine extends Wine{
    @Override
    public String getHolidayName() {
        return "Новый год";
    }
}