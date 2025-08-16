import java.util.*;
public class question2 {
    public static void main(String[] args){
        double x = 2;
        int n = 10;
        System.out.println(myPow(x,n));
    }

    public static double myPow(double x, int n){
        double result = 1.0;
        long exp = n;

        if(exp<0){
            x  =1/x;
            exp = -exp;
        }

        while(exp>0){
            if((exp & 1) == 1){
                result*=x;
            } 
            x *= x;
            exp >>=1;
        }
        return result;

    }
}
