public class MultiplicationMatrix {
    public static void main(String[] args) {
        int [] [] A = {{1,2} , {3,4}};
        int [] [] B = {{5,6} , {7,8}};

        int rowA = A.length;
        int colA = A[0].length;
        int colB = B[0].length;

        int [] [] res = new int [rowA][colB];

        for (int i=0;i<rowA;i++){
            for (int j=0;j<colB;j++){
                res[i][j] = 0;
                for (int k= 0 ; k< colA;k++){
                    res[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }

        for (int i = 0 ;i<res.length;i++){
            for (int j = 0 ; j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }

    }
}
