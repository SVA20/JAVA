package laba1;

public class Primes {
    public static void main(String[] args) {
        for (int n = 2; n<101; n++)
            if (isPrime(n))
                System.out.print (n+" ");
    }

    //данная функция определяет является ли число простым
    public static boolean isPrime(int n)
    {
        for (int i =2; i<10; i++)
            if ((n%i==0) && (n!=i))
                return false;
        return true;
    }
}
