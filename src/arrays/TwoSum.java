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

        //better-approach but a bit complex

        // Two Pointer Approach
        // Time Complexity: O(n log n)
        // Space Complexity: O(n)

        // Store:
        // [value, originalIndex]

        int [][] arr = new int[nums.length][2];
        //fill the help array
        for(int i=0;i<nums.length;i++){
            arr[i][0] = nums[i]; // filling first column
            arr[i][1] = i; // filling second column
        }

        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int left = 0,right = nums.length-1;
        while(left<right){
            int sum = arr[left][0] + arr[right][0];
            if(sum==target){
                return new int[] {arr[left][1],arr[right][1]};
            }
            else if (sum>target){
                right--;
            }
            else {
                left++;
            }

        }
        return new int[] {};


    }

    public int[] twoSum(int[] nums, int target) {
        // optimal solution
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