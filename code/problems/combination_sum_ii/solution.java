class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        findcomb(0,arr,  target, ans, new ArrayList<>());

        for(List<Integer> ls : ans){
       for(Integer i : ls){
        System.out.print(i +" ");
       }
       System.out.println("");
    }
        return ans;
    }

    void findcomb(int index,int[] arr, int target, List<List<Integer>> ans, List<Integer> ls){

        if(target == 0){
            ans.add(new ArrayList<>(ls));
            return;
        }

        

        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] ==  arr[i - 1]) continue;
            if(arr[i] > target) break;

            ls.add(arr[i]);
            findcomb(i + 1, arr, target - arr[i], ans, ls);
            ls.remove(ls.size() - 1);

        }

    }
}