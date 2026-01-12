public class Diagonal {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4},{7,8,9}};

        for(int i = 0;i<nums.length;i++){
            if(nums[i].length>i){
                System.out.println(nums[i][i]);
            }else{
                System.out.println(nums[i][0]);
            }
        }
    }
}
