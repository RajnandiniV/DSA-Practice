class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int toFind = target - nums[i];

           if(!map.containsKey(toFind)){
                map.put(nums[i],i);


           }else{
              int[] ans = new int[2];
              ans[0]=map.get(toFind); //return value of key
              ans[1]=i;
              return ans;

           }
        }
        return new int[]{}; //{arr[0],arr[1]}
    }
}
        