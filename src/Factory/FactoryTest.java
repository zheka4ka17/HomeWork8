package Factory;

public class FactoryTest {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }
}
abstract class Hen{
   public abstract int getCountOfEggsPerMonth();

   public void getDescription(){
       System.out.print("Я - курица.");
   }

}

class RussianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }

    }


class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());

    }
}

class MoldovanHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 3;
    }


    @Override
    public void getDescription() {
        super.getDescription();
        String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());

    }
}

class BelarusianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());

    }
}



interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}

 class HenFactory {

    static Hen getHen(String country) {
        Hen hen = null;

        switch (country) {
            case Country.BELARUS:
                hen = new BelarusianHen();
                break;
            case Country.RUSSIA:
                hen = new RussianHen();
                break;
            case Country.UKRAINE:
                hen = new UkrainianHen();
                break;
            case Country.MOLDOVA:
                hen = new MoldovanHen();
                break;
        }
        return hen;
    }
}