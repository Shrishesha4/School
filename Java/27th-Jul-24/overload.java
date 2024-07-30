/*
 * 1 - no args -> "welcome to java" x 1
 * 2 - one String -> "welcome to polymorphism" x 2
 * 3 - one String, one Int -> "welcome to overloading" x 3
 */

class methods{
    void A(){
        System.out.println("welcome to java");
    }

    void A(String x){
        for (int i = 0; i < 2; i++){
            System.out.println(x);
        }
    }

    void A(String x, int y){
        for (int i = 0; i < 3; i++){
            System.out.println(x);
        }
    }
}

public class overload {
    public static void main(String[] args) {
        methods obj = new methods();
        obj.A();
        obj.A("welcome to polymorphism");
        obj.A("welcome to overloading", 3);
    }
}
