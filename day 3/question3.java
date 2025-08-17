import java.util.*;

public class question3{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,4,4,4,1};
        int res = Major(arr);
        System.out.println(res);
    }
    public static int Major(int[] arr){
        int major  = arr[0];
        int votes = 1;
        for(int i=1;i<arr.length;i++){
            if(major == arr[i]) votes++;
            else if(votes==0){
                major = arr[i];
                votes++;
            }
            else votes--;
        }
        return major;
    }
}