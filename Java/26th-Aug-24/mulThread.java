class Athread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting Thread A");
    }
}

class Bthread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1 + ", " + n2);
        try {
            for (int i = 0; i < 10; i++) {
                n3 = n1 + n2;
                System.out.println(", " + n3);
                n1 = n2;
                n2 = n3;
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("\nExiting Thread B");
    }
}

class mulThread {
    public static void main(String[] args) {
        Athread A = new Athread();
        Bthread B = new Bthread();
        A.start();
        B.start();
    }
}
