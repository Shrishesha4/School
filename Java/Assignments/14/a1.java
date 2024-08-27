class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1, count = 0; count < 10; i += 2, count++) {
                System.out.println("Odd Number: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting OddThread");
    }
}

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        try {
            for (int i = 1; i <= 10; i++) {
                sum += i;
                System.out.println("Sum after " + i + " terms: " + sum);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting SumThread");
    }
}

class a1 {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        SumThread sumThread = new SumThread();
        oddThread.start();
        sumThread.start();
    }
}
