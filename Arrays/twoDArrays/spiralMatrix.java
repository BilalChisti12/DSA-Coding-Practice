package Arrays.twoDArrays;
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
//        for(int i=0; i<matrix.length; i++){
//            for(int j=)
//        }
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0, endRow = m-1;
        int startCol = 0, endCol = n-1;
        while(startCol <= endCol && startRow <= endRow){
            //top
            for(int j= startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //down
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endCol][j]+" ");
            }
            //left
            for(int i= endCol-1; i>= startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
