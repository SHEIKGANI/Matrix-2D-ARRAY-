public class MaxCols {
    public static void main(String[] args) {
              
        int [] [] num ={{1,2,3},{4,5},{6,7,8,9}};

        int maxcols = 0;

        for(int i = 0; i < num.length;i++){
            maxcols=Math.max(maxcols,num[i].length);
        }
        for(int j = 0;j<maxcols;j++){
            for(int i = 0;i<num.length;i++){
                if(j<num[i].length){
                    System.out.println(num[i][j]);
                }else{
                    System.out.println();
                }
            }
        }
    }
}
