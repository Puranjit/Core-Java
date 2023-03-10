abstract class Computer {
    public abstract void show();
}

class Laptop extends Computer {
    public void show() {
        System.out.println("Code, Compile, and Run...");
    }
}

class Desktop extends Computer {
    public void show() {
        System.out.println("Code, Compile, and Run fasterrr...");
    }
}

class Developer {
    public void show(Computer comp) {
        comp.show();
    }
}

public class AbstractCont {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer puran = new Developer();
        puran.show(lap);
        puran.show(desk);
    }
}
