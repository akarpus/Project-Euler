import java.util.ArrayList;

public class problem7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        int count = 0;
        int primeNumber = 2;
        boolean result;
        
        while (count != 10001) 
        {
            result = isPrime(primeNumber);
            if (result == true)
            {
                count += 1 ;
                list.add(primeNumber);
            }
            primeNumber++;
        }
        System.out.println("The 10001st prime number is: " + list.get(10000));
    }
    
    public static boolean isPrime(int number){
        int i = 1;
        boolean result = false;
        
        while (i <= number) 
        {
            if (i == number)
            {
                result = true;
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
