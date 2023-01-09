package Factory;

public class Ex1 {
    public static void main(String[] args) {
println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}
interface Bridge{
    int getCarsCount();
}
class WaterBridge implements Bridge{

    @Override
    public int getCarsCount() {
        return 100;
    }
}

class SuspensionBridge implements Bridge{

    @Override
    public int getCarsCount() {
        return 200;
    }
}