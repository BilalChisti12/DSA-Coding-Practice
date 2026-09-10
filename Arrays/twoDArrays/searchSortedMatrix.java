package Arrays.twoDArrays;

public class searchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 135;
        int i=0, j=matrix[i].length-1;
        boolean found = false;
        while(i <= matrix.length-1 && j>=0){
            if(matrix[i][j] == key){
                found = true;
                break;
            }
            if(key > matrix[i][j]){
                i++;
            }
            else if(key < matrix[i][j]){
                j--;
            }
        }
        if(found){
            System.out.println(i+" "+j);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
