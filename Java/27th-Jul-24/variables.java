class sta{
    public static int a = 5;

    public static void add() {
        System.out.println(a + a);
    }
}

public class variables {
    public static int a = 0;

    public static int fact(int x ){
        if (x == 0){
            return 1;
        }
        return x * fact(x - 1);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            a++;
            System.out.println(a);
        }
        System.out.println();
        System.out.println(fact(a));
        System.out.println();
        sta.add();
    }


}