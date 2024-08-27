class PalindromeThread extends Thread {
    int num;
    
    PalindromeThread(int n) {
       num = n;
    }
    
    public void run() {
        int reversed = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
        System.out.println("Exiting PalindromeThread");
    }
}

class PrimeThread extends Thread {
    int num;
    
    PrimeThread(int n) {
        num = n;
    }
    
    public void run() {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
        System.out.println("Exiting PrimeThread");
    }
}

class a2 {
    public static void main(String[] args) {
        int number = 121;
        PalindromeThread palindromeThread = new PalindromeThread(number);
        PrimeThread primeThread = new PrimeThread(number);
        palindromeThread.start();
        primeThread.start();
    }
}
