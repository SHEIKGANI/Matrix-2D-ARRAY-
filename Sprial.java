public class Sprial {
    public static void main(String[] args) {
        
        int [] [] num = {{1,2,3},{4,5,6},{7,8,9}};

        int top = 0;
        int bottom = num.length-1;
        int left = 0;
        int right = num[0].length-1;

        while (top<=bottom && left<=right) {

         // Traverse from left to right along the top row
        for (int i=left; i<=right;i++){
            System.out.println(num[top][i]);
        }
        top++;

        // Traverse from top to bottom along the right column
        for (int i=top; i<=bottom;i++){
            System.out.println(num[i][right]);
        }
        right--;

        // Traverse from right to left along the bottom row
        if(top<=bottom){
            for (int i=right; i>=left; i--){
                System.out.println(num[bottom][i]);
            }
            bottom--;
        }

        // Traverse from bottom to top along the left column
        if(left<=right){
            for (int i=bottom; i>=top; i--){
                System.out.println(num[i][left]);
            }
            left++;
        }
    }
    }
}
