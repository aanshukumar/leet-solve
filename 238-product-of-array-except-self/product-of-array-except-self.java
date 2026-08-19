class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        Arrays.fill(result,1);

        int preFix = 1, postFix = 1;

        for(int i=0; i<nums.length; i++){
            result[i] = preFix;
            preFix = nums[i]*preFix;
        }

        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i]*postFix;
            postFix = postFix*nums[i];
        }

        return result;
        
    }
}