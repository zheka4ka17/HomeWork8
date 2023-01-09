package Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        Person1 ivan = new Person1("Ivan");
        List<Money> list = ivan.getAllMoney();
        for (Money money : list) {
            System.out.println(ivan.getName() + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }
}
 class Person1{
    private List<Money> allMoney;

    public String getName() {
        return name;
    }

    private String name;
    public Person1(String name) {
        this.name = name;
        this.allMoney= Arrays.asList(new Ruble(100.0),new Hryvnia(0.0),new USD(30000.0));

    }

    public List<Money> getAllMoney() {
        return allMoney;
    }
}
abstract  class Money {
    private double amount;

    public Money(double amount) {
        this.amount= amount;
    }
    public  double getAmount(){
        return this.amount;
    }
    public abstract String getCurrencyName();
}
 class Ruble extends Money{
        public Ruble(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName() {
        return "BLR";
    }
}
class Hryvnia extends Money{
        public Hryvnia(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
 class USD extends Money {
        public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}