import java.util.*;
public class question4 {
    public static void main(String[] args){
        int[] arr = {11,33,11,33,33,11};
        List<Integer> ans = Major2(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    
    public static List<Integer> Major2(int[] nums){
        int cnt1=0;int cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1++;
                el1= nums[i];
            }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2++;
                el2= nums[i];
            }
            else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]==el2) cnt2++;
        }
        List<Integer> res = new ArrayList<>();
        int k=(n/3)+1;
        if(cnt1>=k) res.add(el1);
        if(cnt2>=k) res.add(el2);

        return res;
    }
}
