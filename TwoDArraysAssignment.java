

// question 1
/*public class TwoDArraysAssignment {
    public static void main(String[] args) {
        int array[][]= {{4,7,8},{8,8,7}};
        int num = 7;
        int counter=0;
        for (int i = 0; i <= array.length-1; i++) {
            for (int j = 0; j<=array[0].length - 1; j++) {
                if (array[i][j] == num) {
                    counter++;
                }
            }
        }
        System.out.println(counter); 
    }
}
*/

//question2 
/* 
public class TwoDArraysAssignment {
    public static void main(String[] args) {
        int array[][]=  {{1,4,9},{11,4,3},{2,2,3} };
        int sum = 0;
        int row = 1;
        for(int j = 0;j < array[0].length; j++){
            sum += array[row][j];
        }
        System.out.println(sum); 
    }
}
*/

// question 3 - matrix transpose
public class TwoDArraysAssignment {
    public static void printMatrix(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 2, col = 3;
        int matrix[][]=  {
            {1,2,3},
            {4,5,6} };
        
        //displaying original matrix    
        printMatrix(matrix);
        System.out.println();

        // creating transpose matrix
        int transpose[][]= new int[col][row];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        //print the transposed matrix
        printMatrix(transpose);
    }
}
