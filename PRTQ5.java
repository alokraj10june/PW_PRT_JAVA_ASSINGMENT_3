package Assingment3prt;
import java.util.Arrays;
public class PRTQ5 {
    static int[] plusone(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
                //starting from extreme right-->if digits[i] is less than 9 means can be added with 1
                //i.e [5,8]-->[5,9] or
                //    [9,4]-->[9,5]
                //and directly return array
            }
            digits[i]=0;
            //if digits[i] is not less than 9 or it have to be 9 only then then digits change to 0
            //and we again revolve arount loop to check for number if less than 9 or not
            //i.e.  [5,9]-->[5,0]-->[6,0]
            //      [1,9,9]-->[1,9,0]--[1,0,0]-->[2,0,0]
        }
        // if all number inside array are 9
        //[9,9,9,9]-->than according to above loop to check the it will become[0,0,0,0]
        //but we have to make it like this [9,9,9,9]-->[1,0,0,0,0]

        //to make like above we need to make array of length--->N+1
        //by default new array values are set to --->0 only
        //this just changed first value of arrray to 1 and return the array
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits={1,2,3};
        System.out.println(Arrays.toString(plusone(digits)));
    }
}

