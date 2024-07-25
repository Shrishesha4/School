public class AddOops {
    class Add {
        int a, b, c;
        void get(){
            a = 10;
            b = 20;
        }
        void cal(){
            c = a + b;
        }
        void display(){
            System.out.println("Sum is: " + c);
        }

    }

    public static void main(String[] args) {
        AddOops obj = new AddOops();
        Add obj1 = obj.new Add();
        obj1.get();
        obj1.cal();
        obj1.display();
    }
}
