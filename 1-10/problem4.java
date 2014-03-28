public class problem4 {
    public static void main(String[] args) {
        boolean test;
        int total = 0;
        int highestTotal = 0;
        test = isPalindrome(1000);
        
        
        for (int i = 100; i < 1000; i++) 
            for (int j = 100; j < 1000; j++)
        {
            total = j*i;
            if (isPalindrome(total) == true) 
            {
                if (total >= highestTotal)
                {
                    highestTotal = total;
                    total = 0;
                }
            }
        }
        System.out.println("Largest palindrome is: " + highestTotal);
    }
    
    public static boolean isPalindrome(int num) {
        String number = Integer.toString(num);
        int length = number.length();
        String reverse = "";
        boolean palindrome;
        
        for (int i = length -1; i >= 0; i--)
            reverse = reverse + number.charAt(i);
        
        if (number.equals(reverse))
            palindrome = true;
        else
            palindrome = false;
        
        return palindrome;
    }
}
