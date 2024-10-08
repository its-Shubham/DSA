
public class TwoDArray {

    public static int smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static int largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("element found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("element not found");
        return false;
    }

    // Spiral Matrix
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }

    // diagonal sum in matrix
    public static void diagonalSum(int matrix[][]) {
        // (brute force method) -> O(n^2)
        /*  
        int sum = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        */

        // optimised method -> O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        System.out.println("sum of the matrix is : " + sum);
    }

    // Staircase Search -> O(m+n)
    public static boolean staircaseSearch(int matrix[][], int key) {
        // From top right approach
        /*
        int row = 0,col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        */

        // From bottom left approach
        int row = matrix.length-1, col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("element not found!");
        return false;
    }
    
    public static void display(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // Scanner sc = new Scanner(System.in);
        // int m = matrix.length;
        // int n = matrix[0].length;
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // display(matrix);

        // System.out.println(smallest(matrix));

        // System.out.println(largest(matrix));

        // search(matrix, 2);
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // printSpiral(matrix);
        // diagonalSum(matrix);
        int key = 12;
        staircaseSearch(matrix, key);
    }
}
