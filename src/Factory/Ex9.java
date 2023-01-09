package Factory;

import java.util.Scanner;

public class Ex9 {
    public static Planet thePlanet;
    public static void main(String[] args) {
readKeyFromConsoleAndInitPlanet();
        System.out.println(thePlanet.getClass());
    }

   public static void readKeyFromConsoleAndInitPlanet(){
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       if(s.equals(Planet.SUN))
           thePlanet= Sun.getSun();
       else  if (s.equals(Planet.MOON))
           thePlanet= Moon.getMoon();
       else if (s.equals(Planet.EARTH))
           thePlanet= Earth.getEarth();

   }
}
 class LazyInitializedSingleton {

     private static LazyInitializedSingleton instance;


     private LazyInitializedSingleton() {
     }

     public LazyInitializedSingleton getInstance(){
         if (instance==null)
             instance= new LazyInitializedSingleton();
         return instance;
     }
}

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}

class Sun implements Planet{
    private String name;
    private static Sun sun=null;


    private Sun() {
        this.name=Planet.SUN;
    }

    public static Sun getSun(){
        if (sun==null){
            sun=new Sun();}
        return sun;
    }
}

class Earth implements Planet{
    private String name;
    private static Earth earth=null;


    private Earth() {
        this.name=Planet.EARTH;
    }

    public static Earth getEarth(){
        if (earth==null){
            earth=new Earth();}
        return earth;
    }
}

class Moon implements Planet{
    private String name;
    private static Moon moon=null;


    private Moon() {
        this.name=Planet.MOON;
    }

    public static Moon getMoon(){
        if (moon==null){
           moon=new Moon();}
        return moon;
    }
}