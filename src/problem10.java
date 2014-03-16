public class problem10 {
    public static void main(String[] args) {
        long sum = 0L;   // begin sum with addition of prime #'s 2 & 3
        int i = 2;
        boolean result;
        
        while (i < 2000000) 
        {
            result = isPrime(i);
            if (result == true) sum += i;
            i++;
        }
        System.out.println("Sum of all primes below two million: " + sum);
    }
    public static boolean isPrime(int number){
        int i = 1;
        boolean result = false;
        
        while (i <= number) 
        {
            if (i == number)
            {
                result = true;
                // System.out.println(number);
                break;
            }
            if ((number % i == 0) && (i != 1))
            {
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}
