package 移除元素;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {3,2,2,3};
        int val = in.nextInt();
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val)
                nums[j] = nums[i];
                j++;
        }
        return j;
    }
}
