class MultiplicationTable extends Thread 
{
    public void run() 
    {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        System.out.println();
    }
}

class PrimeNumbers extends  Thread 
{
    private int n;

    public PrimeNumbers(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("First " + n + " Prime Numbers:");
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}

// Main class
public class ThreadExample 
{
    public static void main(String[] args)  {
       Thread t1 = new MultiplicationTable();
Thread t2 = new PrimeNumbers(10);

t1.start();
//1.join(); // wait for multiplication table to finish

t2.start();
//t2.join(); // then start primes
    }
}