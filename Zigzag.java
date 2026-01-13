public class Zigzag {
    public static void main(String[] args) {
        
        int [] [] num = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0 ;i<num.length;i++){
            if(i%2==0){
                for(int j = 0;j<num[i].length;j++){
                    System.out.println(num[i][j]);
                }
            }else{
                    for(int j = num[i].length-1;j>=0;j--){
                        System.out.println(num[i][j]);
                    }
                }
        }
    }
}
