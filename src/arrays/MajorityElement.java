// brute force approach
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}

// better approach
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int counter =0;
        HashMap<Integer, Integer> element = new HashMap<>();
        for(int i=0;i<n;i++){
            element.put(nums[i],element.getOrDefault(nums[i],0)+1);
            if(element.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}

//optimal approach
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count =0;
        int element = 0;
        for(int i=0;i<n;i++){
            if(count ==0){
                element = nums[i];
            }
            if(element != nums[i]){
                count --;
            } else {
                count++;
            }
        }
        return element;
    }
}