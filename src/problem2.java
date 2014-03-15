public class problem2 {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 2;
        int total = 2;
        int count = 2;
        int next;
        
        while (count < 6000000) {
            next = p1 + p2;
            if (next % 2 == 0) 
                total = total + next;
            p1 = p2;
            p2 = next;
            count = count + next;
        }
         System.out.println("Final total: " + total);
    }
}
