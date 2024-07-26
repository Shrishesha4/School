class ConsOverload{
    ConsOverload(){
        System.out.println("Welcome");
    }

    ConsOverload(int a, int b){
        System.out.println(a+b);
    }

    ConsOverload(int a, int b, int c){
        System.out.println(a+b+c);
    }

    ConsOverload(int a, double b){
        System.out.println(a+b);
    }
}

public class constructorOverloading {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        ConsOverload obj = new ConsOverload();
        ConsOverload obj1 = new ConsOverload(10, 20);
        ConsOverload obj2 = new ConsOverload(10, 20, 30);
        ConsOverload obj3 = new ConsOverload(10, 20.5);
    }
}
