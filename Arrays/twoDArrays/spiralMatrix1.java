package Arrays.twoDArrays;

public class spiralMatrix1 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow=0, endRow = m-1, startCol = 0, endCol = n-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
