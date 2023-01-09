package Factory;

public class Ex4 {
    public static void main(String[] args) {
Computer computer = new Computer(new KeyBoard(),new Monitor(), new Mouse());
if (isWork(computer.getKeyBoard())&& isWork(computer.getMonitor()) && isWork(computer.getMouse())){
    System.out.println("work");
}

    }
    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }
}
interface CompItem{
    String getName();

}
class Mouse implements CompItem{

    @Override
    public String getName() {
        return "Mouse";
    }
}
class Monitor implements CompItem{

    @Override
    public String getName() {
        return "Monitor";
    }
}
class KeyBoard implements CompItem{

    @Override
    public String getName() {
        return "KeyBoard";
    }
}

class Computer{
    private KeyBoard keyBoard;
    private Monitor monitor;
    private Mouse mouse;


    public Computer(KeyBoard keyBoard, Monitor monitor, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}