package Factory;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        boolean flag =true;
        while(flag) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (s.equals("user")){
                Person person = new User();
                doWork(person);        }
                else if (s.equals("loser")){
                    Person person= new Loser();
                doWork(person);
            }
            else if (s.equals("coder")){
                Person person = new Coder();
                doWork(person);
            }
                else if (s.equals("proger")){
                    Person person = new Proger();
                doWork(person);
            }
                    else flag=false;

        }

    }

    public static void doWork(Person person){
        if(person instanceof User)
            ((User)person).live();
        else  if(person instanceof Loser)
            ((Loser)person).doNothing();
        else  if(person instanceof Coder)
            ((Coder)person).writeCode();
        else  if(person instanceof Proger)
            ((Proger)person).enjoy();

    }
}
 class Person{

 }
 class User extends Person{
    public void live(){
        System.out.println("I live");
    }
 }
 class Loser extends Person{
    public void doNothing(){
        System.out.println("I nothing doing");
    }
 }

 class Coder extends Person{

 public void writeCode(){
     System.out.println("I write code");

 }
 }

 class Proger extends Person{
     public void enjoy(){
         System.out.println("I enjoy");
     }
 }