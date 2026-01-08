public class AddMulti {
    public static void main(String[] args) {
        //Declaration of 2x2 matrix
        int [] [] matrix1 = { {1,2} , {3,4} };
        int [] [] matrix2 = { {5,6} , {7,8} };
        //access arr
        // System.out.println(matrix1[0][1]);
        // System.out.println(matrix1[1][1]);

        int rowSize = matrix1.length;
        int colSize = matrix1[0].length;

        int [] [] matrix3 = new int[rowSize][colSize];

        for ( int i = 0 ; i < matrix1.length;i++ ){
            for ( int j = 0 ; j < matrix1[0].length;j++ ){
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        for (int i = 0;i<matrix3.length;i++){
            for (int j = 0; j<matrix3[0].length;j++){
                System.out.println(matrix3[i][j]);
            }
        }
    }
}
