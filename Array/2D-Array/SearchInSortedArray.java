public class SearchInSortedArray {
    public static boolean StairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {  
            if (matrix[row][col] == key) {
                System.err.println("Found at: (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        System.err.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 29;
        StairCaseSearch(matrix, key);
    }
}
