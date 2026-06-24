class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans =new ArrayList<>();

        backtrack(0,candidates,target,new ArrayList<>(),ans);
        return ans;

    }

    public void backtrack(int idx,int [] arr,int target,List<Integer> curr,List<List<Integer>> ans){


        if (target==0){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        if(idx== arr.length){
            return;
        }

        if(arr[idx]<=target ){

           curr.add(arr[idx]);
            backtrack(idx,arr,target-arr[idx],curr,ans);
            curr.remove(curr.size()-1);

        }

        backtrack(idx+1,arr,target,curr,ans);
        
        }
    
}