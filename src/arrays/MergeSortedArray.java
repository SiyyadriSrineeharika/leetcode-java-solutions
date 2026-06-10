class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    //brute soltuion
    int i=m,j=0;
    while(i<m+n && j<n){
      nums1[i]=nums2[j];
      i++;j++;
    }
    Arrays.sort(nums1,0,m+n);
  }
}
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    //optimal three pointer solution
    int i=m-1,j=n-1,k=m+n-1;
    while(j>-1){
      if(i>=0 && nums1[i]>nums2[j]){
        nums1[k]=nums1[i];
        k--;
        i--;
      }
      else {
        nums1[k]=nums2[j];
        k--;
        j--;
      }
    }
  }
}