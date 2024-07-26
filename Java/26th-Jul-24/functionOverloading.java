class FuncOverload{
    int a=10, b=10;
    void add(){
        System.out.println("Addition: " + (a + b));
    }

    void add(int x, int y){
        System.out.println("Addition: " + (x + y));
    }

    void add(int x, int y, int z){
        System.out.println("Addition: " + (x + y + z));
    }

    void add(double x, double y){   
        System.out.println("Addition: " + (x + y));
    }

    void add(int x, double y){   
        System.out.println("Addition: " + (x + y));
    }

    double add(double x, int y){   
        x += y;
        return x;
    }
}

public class functionOverloading {
    public static void main(String[] args) {
        FuncOverload obj = new FuncOverload();
        obj.add();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
        obj.add(10, 20.5);
        System.out.println(obj.add(10.5, 20));
    }
}
