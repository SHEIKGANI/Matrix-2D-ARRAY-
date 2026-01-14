public class DegRotation {
   

    public static void rotate(int[][] num) {

        int n = num.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = num[i][j];
                num[i][j] = num[j][i];
                num[j][i] = temp;
            }
        }

        // Step 2: Reverse

        for (int i=0; i< n; i++){

            int left=0; int right = n-1;

            while(left < right){
                int temp = num[i][left];
                num[i][left] = num[i][right];
                num[i][right]=temp;
                left++;
                right--;
            }

        }

    }

    public static void main(String[] args) {

        int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(num);

        for (int[] newmat : num){
            for (int val: newmat){
                System.out.println(val + " ");
            }
        }

    
}
}
