// Last updated: 11/08/2026, 11:42:08
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=nums1.length;i<n;i++){
            arr[i]=nums2[n-i-1];
        }

        Arrays.sort(arr);

        if(n%2==0){
            double x = arr[n/2] + arr[(n/2)-1];
            return x/2;
        }

        double x = arr[n/2];
        return x;
    }
}