class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> allsubsets = new ArrayList<>();
        Arrays.sort(nums);

        helper(0,nums,new ArrayList<>(),allsubsets);
        return allsubsets;
        
    }
    public void helper(int idx,int[] arr,List<Integer> curr,List<List<Integer>> ans){
        if(idx==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //include
        curr.add(arr[idx]);
        helper(idx+1,arr,curr,ans);

        //bacltrack
        curr.remove(curr.size()-1); 


      //skip duplicates
        int i = idx+1;
        while(i<arr.length && arr[i]==arr[i-1]){
            i++;    
        }
         //exclde
        helper(i,arr,curr,ans); //took i not idx


    }
}