package 删除排序数组中的重复项;
/**
 * 2019/4/17
 * author:lixinyi
 */
//双指针移动法
public class Arrary {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3};
        System.out.println(removeDuplicates(nums));
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int i = 0;
        for(int j = 1;j < nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
