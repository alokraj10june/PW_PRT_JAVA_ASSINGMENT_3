package Assingment3prt;
public class PRTQ6 {
        static int singleNumber(int[] nums) {
            int result=0;
            for(int i=0; i<nums.length; i++) {
                result = result^nums[i];
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.println(singleNumber(nums));

    }
    }

