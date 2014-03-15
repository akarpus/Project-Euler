class problem6 {
    
    public static void main(String[] args) {
        int sumSquares = 0;
        int squaresSum = 0;
        int difference = 0;
        
        for (int i = 1; i <= 100; i++) {
            sumSquares += i*i;
            squaresSum += i;
        }
        squaresSum = squaresSum * squaresSum;
        difference = squaresSum - sumSquares;
        System.out.println("The difference is: " + difference);
    }
}
