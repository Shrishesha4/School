public class disp {
    public static void main(String[] args) {
        System.out.println("Using For loop:");
        for (int i=0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("\nUsing While loop:");
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("\nUsing Do-While loop:");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j<10);
    }
}
