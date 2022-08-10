public class _485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                sum++;
            }else {
                sum=0;
            }
            max=Math.max(sum,max);

        }
        return max;
    }
}
