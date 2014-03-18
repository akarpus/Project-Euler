public class problem11 {
    public static void main(String[] args) {
        int array[] = 
        {
             8,  2, 22, 97, 38, 15,  0, 40,  0, 75,  4,  5,  7, 78, 52, 12, 50, 77, 91,  8,
            49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48,  4, 56, 62,  0,
            81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30,  3, 49, 13, 36, 65,
            52, 70, 95, 23,  4, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91,
            22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80,
            24, 47, 32, 60, 99,  3, 45,  2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50,
            32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70,
            67, 26, 20, 68,  2, 62, 12, 20, 95, 63, 94, 39, 63,  8, 40, 91, 66, 49, 94, 21,
            24, 55, 58,  5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72,
            21, 36, 23,  9, 75,  0, 76, 44, 20, 45, 35, 14,  0, 61, 33, 97, 34, 31, 33, 95,
            78, 17, 53, 28, 22, 75, 31, 67, 15, 94,  3, 80,  4, 62, 16, 14,  9, 53, 56, 92,
            16, 39,  5, 42, 96, 35, 31, 47, 55, 58, 88, 24,  0, 17, 54, 24, 36, 29, 85, 57,
            86, 56,  0, 48, 35, 71, 89,  7,  5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58,
            19, 80, 81, 68,  5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77,  4, 89, 55, 40,
             4, 52,  8, 83, 97, 35, 99, 16,  7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66,
            88, 36, 68, 87, 57, 62, 20, 72,  3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69,
             4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18,  8, 46, 29, 32, 40, 62, 76, 36,
            20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74,  4, 36, 16,
            20, 73, 35, 29, 78, 31, 90,  1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57,  5, 54,
             1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52,  1, 89, 19, 67, 48,
        };
        
        diagonalLR(array);
        diagonalRL(array);
        diagonalBR(array);
        diagonalRB(array);
        upDown(array);
        leftRight(array);
    }
    
    /* ---------------------------------------------- */
    /*                 Left to Right                  */
    /* ---------------------------------------------- */
    public static int diagonalLR(int[] array){
        int currentProduct = 0;
        int largestProduct = 0;
        int i = 0;
        
        while (i < 400)
        {
            if (i == 17 || i == 37 || i == 57 || i == 77 || i == 97 ||
                i == 117 || i == 137 || i == 157 || i == 177 || i == 197 ||
                i == 217 || i == 237 || i == 257 || i == 277 || i == 297 ||
                i == 317)
                i += 3;
            
            if (i == 337)
                break;
            
            currentProduct = array[i]*array[i+21]*array[i+42]*array[i+63];
            
            if (currentProduct > largestProduct)
            {
                largestProduct = currentProduct;
                currentProduct = 0;
            }
            i++;
        } 
        System.out.println("****Largest Product**** : " + largestProduct);
        return largestProduct;
    }
    /* ---------------------------------------------- */
    /*                 Right to Left                  */
    /* ---------------------------------------------- */
    public static int diagonalRL(int[] array){
        int currentProduct = 0;
        int largestProduct = 0;
        int i = 0;
        
        while (i < 400)
        {
            if (i == 20 || i == 40 || i == 60 || i == 80 || i == 100 ||
                i == 120 || i == 140 || i == 160 || i == 180 || i == 200 ||
                i == 220 || i == 240 || i == 260 || i == 280 || i == 300 ||
                i == 320 || i == 0)
                i += 3;
            
            if (i == 340)
                break;
            
            currentProduct = array[i]*array[i+19]*array[i+38]*array[i+57];
            if (currentProduct > largestProduct)
            {
                largestProduct = currentProduct;
                currentProduct = 0;
            }
            i++;
        } 
        System.out.println("****Largest Product**** : " + largestProduct);
        return largestProduct;
    } 
    
    /* ---------------------------------------------- */
    /*                 Left to Right                  */
    /* ---------------------------------------------- */
    public static int diagonalBR(int[] array){
        int currentProduct = 0;
        int largestProduct = 0;
        int i = 340;
        
        while (i < 400)
        {
            if (i == 357 || i == 377)
                i += 3;
            if (i == 397)
                break;
            
            currentProduct = array[i]*array[i-19]*array[i-38]*array[i-57];
            
            if (currentProduct > largestProduct)
            {
                largestProduct = currentProduct;
                currentProduct = 0;
            }
            i++;
        } 
        System.out.println("****Largest Product**** : " + largestProduct);
        return largestProduct;
    } 
    
    /* ---------------------------------------------- */
    /*                 Right to Left                  */
    /* ---------------------------------------------- */
    public static int diagonalRB(int[] array){
        int currentProduct = 0;
        int largestProduct = 0;
        int i = 343;
        
        while (i < 400)
        {
            if (i == 360 || i == 380)
                i += 3;
            
            currentProduct = array[i]*array[i-21]*array[i-42]*array[i-63];
            
            if (currentProduct >= largestProduct)
            {
                largestProduct = currentProduct;
                currentProduct = 0;
            }
            i++;
        } 
        System.out.println("****Largest Product**** : " + largestProduct);
        return largestProduct;
    } 
    
    /* ---------------------------------------------- */
    /*                     Up-Down                    */
    /* ---------------------------------------------- */
    public static int upDown(int[] array){
        int currentProduct = 0;
        int largestProduct = 0;
        int i = 0;
        
        while (i < 400)
        {
            if (i == 340)
                break;
            
            currentProduct = array[i]*array[i+20]*array[i+40]*array[i+60];
            
            if (currentProduct > largestProduct)
            {
                largestProduct = currentProduct;
                currentProduct = 0;
            }
            i++;
        } 
        System.out.println("****Largest Product**** : " + largestProduct);
        return largestProduct;
    } 
    
    /* ---------------------------------------------- */
    /*                    Left-Right                  */
    /* ---------------------------------------------- */
    public static int leftRight(int[] array){
        int currentProduct = 0;
        int largestProduct = 0;
        int i = 0;
        
        while (i < 400)
        {
            if (i == 397)
                break;
            
            if (i == 17 || i == 37 || i == 57 || i == 77 || i == 97 ||
                i == 117 || i == 137 || i == 157 || i == 177 || i == 197 ||
                i == 217 || i == 237 || i == 257 || i == 277 || i == 297 ||
                i == 317)
                i += 3;
            
            currentProduct = array[i]*array[i+1]*array[i+2]*array[i+3];
           
            if (currentProduct > largestProduct)
            {
                largestProduct = currentProduct;
                currentProduct = 0;
            }
            i++;
        } 
        System.out.println("****Largest Product**** : " + largestProduct);
        return largestProduct;
    } 
}
