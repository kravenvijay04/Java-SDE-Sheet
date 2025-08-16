
class question1 {
    public static void main(String[] args){
        int n=3;
        int m=4;
        int[][] arr = {{1,3,5,7},{10,13,15,17},{21,23,25,27}};

        int target = 3;
        boolean result = searchMatrix(arr,n,m,target);
        if(result) System.out.println("target found in matrix");
        else System.out.println("target not found in matrix");
    }

    public static boolean searchMatrix(int[][] matrix,int n,int m,int target){
        int low =0;
        int high= m*n -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int match = matrix[mid/n][mid%n];

            if(match == target)
                return true;
            else if(target < match){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}