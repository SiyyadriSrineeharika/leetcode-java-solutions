class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force approach
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        for (int i=0;i<nums.length;i++){
            for ( int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public int[] twoSum(int[] nums, int target) {
        // Better solution
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        // keep in mind that given is unsorted array
        // two pointer works well with sorted array only

        // think like:
        // target - nums[i] = complement
        // 9 - 2 = 7

        // Can I quickly check if 7 already exists?

        // recognize the hashmap pattern here
        // lookup is O(1)
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}